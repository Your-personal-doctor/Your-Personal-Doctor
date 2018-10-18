package dao;
import po.User;

/** 
* @author Yangling Hu 
* @version create a port to state the method of login and register
*/
public interface UserDao {

	/***
	 * login statement
	 * @param user
	 * @return
	 */
	public User login(User user);
	
	/***
	 * register statement
	 * @param user
	 * @return
	 */
	public boolean register(User user);
}
