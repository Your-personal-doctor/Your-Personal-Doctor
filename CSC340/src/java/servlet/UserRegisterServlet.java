package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import po.User;

/** 
* @author Yangling Hu 
* The servlet of register
*/
@WebServlet("/user/userregister")
public class UserRegisterServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		User user=new User();
		//Get the account and password submitted by the login.jsp page
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		//Get the account and password submitted by the register.jsp page to the entity class User
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		
		//Introducing a data interaction layer
		UserDao dao=new UserDaoImpl();
		boolean flag=dao.register(user);
		if(flag){
			request.setAttribute("info", "Success!");
		}else{
			request.setAttribute("info", "Registration failed");
		}
		
		request.getRequestDispatcher("/index/info.jsp").forward(request, response);
	}
	
}
