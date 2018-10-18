package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


/** 
* @author Yangling Hu
* Data interaction layer
*/
public class BaseDao{
	/*private static String driver="com.mysql.jc.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/jsp?useSSL=false";
	private static String user="root";
	private static String password="12345678";*/
	/***
	 * Connect to the sql
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getCon() throws ClassNotFoundException, SQLException{
		//Class.forName("com.mysql.jc.jdbc.Driver");//load sql
		System.out.println("Loading sql success");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp?useSSL=false", "root", "12345678");
		System.out.println("Connected");
		return con;
	}
	
	/***
	 * Close sql
	 * @param con
	 * @param ps
	 * @param rs
	 */
	public static void close(Connection con,PreparedStatement ps,ResultSet rs){
            //Close resources, aviod problems
		if(rs!=null){    
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/***
	 * Add&update&delete
	 * @param sql
	 * @param arr
	 * @return
	 */
	public static boolean addUpdateDelete(String sql,Object[] arr){
		Connection con=null;
		PreparedStatement ps=null;
		try {
                        //connect to the database
			con=BaseDao.getCon();
                        //Precompiled
			ps=con.prepareStatement(sql);
			//set the value
			if(arr!=null && arr.length!=0){
				for(int i=0;i<arr.length;i++){
					ps.setObject(i+1, arr[i]);
				}
			}
                        //TODO sql statement
			int count=ps.executeUpdate();
			if(count>0){
				return true;
			}else{
				return false;
			}
		}  
                catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                catch (SQLException e) {
                // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return false;
	}
      
	
	public static void main(String[] args) {
		try {
			BaseDao.getCon();
			System.out.println("Connected");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            // TODO Auto-generated catch block
            
	}
	
	
}
