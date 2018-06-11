/**
 * 
 */
package service;

import java.util.List;

import domain.Dept;
import domain.Document;
import domain.Employee;
import domain.Job;
import domain.Notice;
import domain.User;
import util.tag.PageModel;

/**
 * @ClassName:  service   
 * @Description:TODO  
 * @author: 
 * @date:   2018年5月16日 下午10:42:55 
 */
public interface Service {
	/**
	 * @Description: 用户登录     
	 * @return: User
	 */
	User login(String loginname,String password);
	User findUserById(Integer id);
	/**
	 * @Description: 获取所有用户
	 * @param: @param user
	 * @param: @param pageModel
	 * @param: @return            
	 */
	List<User> findUser(User user,PageModel pageModel);
	void addUser(User user);
	void removeUserById(Integer id);
	void modifyUser(User user);

	
	Employee findEmployeeById(Integer id);
	/**
	 * @Description: 获取所有员工 
	 * @param: @param emp
	 * @param: @param pageModel
	 * @param: @return            
	 */
	List<Employee> findEmployee(Employee emp,PageModel pageModel);
	void addEmployee(Employee emp);
	void removeEmployeeById(Integer id);
	void modifyEmployee(Employee emp);
	
	Dept findDeptById(Integer id);
	/**
	 * @Description: 获取所有部门
	 * @param: @param dept
	 * @param: @param pageModel
	 * @param: @return            
	 */
	List<Dept> findDept(Dept dept,PageModel pageModel);
	void addDept(Dept dept);
	void removeDeptById(Integer id);
	void modifyDept(Dept dept);
	
	Job findJobById(Integer id);
	/**
	 * @Description: 获取所有职位
	 * @param: @param job
	 * @param: @param pageModel
	 * @param: @return            
	 */
	List<Job>findJob(Job job,PageModel pageModel);
	void addJob(Job job);
	void removeJobById(Integer id);
	void modifyJob(Job job);
	
	Notice findNoticeById(Integer id);
	/**
	 * @Description: 获取所有公告  
	 * @param: @param not
	 * @param: @param pageModel
	 * @param: @return            
	 */
	List<Notice> findNotice(Notice not,PageModel pageModel);
	void addNotice(Notice notice);
	void removeNoticeById(Integer id);
	void modifyNotice(Notice notice);
	
	Document findDocumentById(Integer id);
	/**
	 * @Description: 获取所有文档
	 * @param: @param document
	 * @param: @param pageModel
	 * @param: @return            
	 */
	List<Document> findDocument(Document document,PageModel pageModel);
	void addDocument(Document document);
	void removeDocumentById(Integer id);
	void modifyDocument(Document document);
	
	
	
	
	
}
