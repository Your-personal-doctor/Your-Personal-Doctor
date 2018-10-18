package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import po.User;
import utils.BaseDao;

/** 
* @author Yangling Hu  
* 
*/
public class UserDaoImpl implements UserDao{

	@Override
	public User login(User user) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
                        //1:Get the connection of sql
			con=BaseDao.getCon();
			//2:sql language
			String sql="select * from user where name=? and password=? ";
			ps=con.prepareStatement(sql);//3：precompile
			//4：set the value
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			rs=ps.executeQuery();//5:TODO sql language
			User users=null;
			if(rs.next()){
				users=new User();
				//Get the value from the database to the setter method of the entity class
				users.setId(rs.getInt("id"));
				users.setName(rs.getString("name"));
				users.setPassword(rs.getString("password"));
				users.setEmail(rs.getString("email"));
				users.setPhone(rs.getString("phone"));
				
				return user;
			}else{
				return null;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            // TODO Auto-generated catch block
		return null;
	}

	/***
	 * Insert method,registration
	 */
	@Override
	public boolean register(User user) {
		String sql="insert into user values(0,?,?,?,?) ";
		List<Object> list=new ArrayList<Object>();
		list.add(user.getName());
		list.add(user.getPassword());
		list.add(user.getEmail());
		list.add(user.getPhone());
		
		boolean flag=BaseDao.addUpdateDelete(sql,list.toArray());
		if(flag){
			return true;
		}else{
			return false;
		}
	}

	
}
