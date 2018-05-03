/**
 * 
 */
package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import domain.Dept;


public interface DeptMapper {
	/**
	 * @Description: select dept by id 
	 * @param: @return            
	 */
	@Select("select * from dept where id=#{id}")
	public Dept selectById(Integer a); 
	/**
	 * @Description: show all dept
	 * @param: @return            
	 */
	@Select("select * from dept")
	public List<Dept> showAllDept();
	/**
	 * @Description: delete dept by id 
	 * @param:             
	 */
	@Delete("delete from dept where id=#{id}")
	public void deleteById(Integer a);
	
	/**
	 * @Description: save dept 
	 * @param: @param dept            
	 */
	public void save(Dept dept);
	/**
	 * @Description: update dept 
	 * @param: @param dept            
	 */
	public void update(Dept dept);
}
