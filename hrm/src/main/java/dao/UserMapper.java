/**
 * 
 */
package dao;

import java.util.List;
import java.util.Map;
import static util.common.HrmConstants.USERTABLE;
import domain.User;




public interface UserMapper {
	
	public User selectByLoginnameAndPassword(String loginname,String password);
	public User selectById(Integer id);
	public void deleteById(Integer id);
	
	//dynamic
	
	/**
	 * @Description: update user  
	 * @param: @param user            
	 */
	public void update(User user);
	/**
	 * @Description: select user by page
	 * @param: @param params        
	 */
	public List<User> selectByPage(Map<String,Object> params);
	
	/**
	 * @Description: count user by username
	 * @param: @param params            
	 */
	public Integer count(Map<String,Object> params);
	/**
	 * @Description: save user  
	 * @param: @param user            
	 */
	public void save(User user);
	

}
