/**
 * 
 */
package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import domain.Job;

/**
 * @ClassName:  JobMapper   
 * @Description:TODO  
 * @author: 
 * @date:   2018年5月9日 下午10:27:21 
 */
public interface JobMapper {
	@Select("select * from job where id=#{id}")
	Job selectById(Integer id); 
	@Delete("delete from job where id=#{id}")
	void deleteById(Integer id);
	
	/**
	 * @Description: select all jobs 
	 * @param: @return            
	 */
	List<Job> selectAllJob();
	/**
	 * @Description: insert to job 
	 * @param:             
	 */
	void save(Job job);
	/**
	 * @Description: update job
	 * @param:             
	 */
	void update(Job job);
	
}
