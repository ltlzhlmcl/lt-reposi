/**
 * 
 */
package dao;

import java.util.List;
import java.util.Map;

import domain.Employee;

/**
 * @ClassName:  EmployeeMapper   
 * @Description:TODO  
 * @author: 
 * @date:   2018年5月11日 下午10:36:01 
 */
public interface EmployeeMapper {
	/**
	 * @Description: select on conditions
	 * @param: @param page params
	 * @param: @return            
	 */
	List<Employee> selectByPage(Map<String,Object> params);
	Employee selectById(Integer id);
	void deleteById(Integer id);
	
	/**
	 * @Description: insert
	 * @param: @param emp            
	 */
	void save(Employee emp);
	void update(Employee emp);
}
