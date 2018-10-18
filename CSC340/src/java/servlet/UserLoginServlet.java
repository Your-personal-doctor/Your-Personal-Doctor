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
* The servlet of Login
* 
*/
@WebServlet("/user/userlogin")
public class UserLoginServlet extends HttpServlet{
	
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
		//Test Data
		System.out.println(name+" "+password);
		//Get the account and password submitted by the login.jsp page to the entity class User.
		user.setName(name);
		user.setPassword(password);
		
		//Introducing a data interaction layer
		UserDao dao=new UserDaoImpl();
		User us=dao.login(user);
		//Test the returned value
		System.out.println(us);
		if(us!=null){
			request.setAttribute("info", "Success!");
		}else{
			request.setAttribute("info", "Fail to login");
		}
		
		request.getRequestDispatcher("/index/info.jsp").forward(request, response);
	}
	
	
	
}
