/**
 * 
 */
package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.DeptMapper;
import dao.DocumentMapper;
import dao.EmployeeMapper;
import dao.JobMapper;
import dao.NoticeMapper;
import dao.UserMapper;
import domain.Dept;
import domain.Document;
import domain.Employee;
import domain.Job;
import domain.Notice;
import domain.User;
import util.tag.PageModel;

/**
 * @ClassName:  ServiceImpl   
 * @Description:TODO  
 * @author: 
 * @date:   2018年5月16日 下午10:43:41 
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service(value="serviceImpl")
public class ServiceImpl implements service.Service {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DeptMapper deptMapper;
	@Autowired
	private JobMapper jobMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private NoticeMapper noticeMapper;
	@Autowired
	private DocumentMapper documentMapper;
	/**
	 * 
	 */
	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see service.Service#login(java.lang.String, java.lang.String)
	 */
	@Transactional(readOnly=true)
	@Override
	public User login(String loginname, String password) {
		System.out.println("Login-->");
		return userMapper.selectByLoginnameAndPassword(loginname, password);
	}

	/* (non-Javadoc)
	 * @see service.Service#findUserById(java.lang.Integer)
	 */
	@Transactional(readOnly=true)
	@Override
	public User findUserById(Integer id) {
		
		return userMapper.selectById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#findUser(domain.User, util.tag.PageModel)
	 */
	@Transactional(readOnly=true)
	@Override
	public List<User> findUser(User user, PageModel pageModel) {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see service.Service#addUser(domain.User)
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.save(user);
	}

	/* (non-Javadoc)
	 * @see service.Service#removeUserById(java.lang.Integer)
	 */
	@Override
	public void removeUserById(Integer id) {
		// TODO Auto-generated method stub
		userMapper.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#modifyUser(domain.User)
	 */
	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

	/* (non-Javadoc)
	 * @see service.Service#findEmployeeById(java.lang.Integer)
	 */
	@Transactional(readOnly=true)
	@Override
	public Employee findEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeMapper.selectById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#findEmployee(domain.Employee, util.tag.PageModel)
	 */
	@Transactional(readOnly=true)
	@Override
	public List<Employee> findEmployee(Employee emp, PageModel pageModel) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see service.Service#addEmployee(domain.Employee)
	 */
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeMapper.save(emp);
	}

	/* (non-Javadoc)
	 * @see service.Service#removeEmployeeById(java.lang.Integer)
	 */
	@Override
	public void removeEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		employeeMapper.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#modifyEmployee(domain.Employee)
	 */
	@Override
	public void modifyEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeMapper.update(emp);
	}

	/* (non-Javadoc)
	 * @see service.Service#findDeptById(java.lang.Integer)
	 */
	@Transactional(readOnly=true)
	@Override
	public Dept findDeptById(Integer id) {
		// TODO Auto-generated method stub
		return deptMapper.selectById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#findDept(domain.Dept, util.tag.PageModel)
	 */
	@Transactional(readOnly=true)
	@Override
	public List<Dept> findDept(Dept dept, PageModel pageModel) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see service.Service#addDept(domain.Dept)
	 */
	@Override
	public void addDept(Dept dept) {
		// TODO Auto-generated method stub
		deptMapper.save(dept);
	}

	/* (non-Javadoc)
	 * @see service.Service#removeDeptById(java.lang.Integer)
	 */
	@Override
	public void removeDeptById(Integer id) {
		// TODO Auto-generated method stub
		deptMapper.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#modifyDept(domain.Dept)
	 */
	@Override
	public void modifyDept(Dept dept) {
		// TODO Auto-generated method stub
		deptMapper.update(dept);
	}

	/* (non-Javadoc)
	 * @see service.Service#findJobById(java.lang.Integer)
	 */
	@Transactional(readOnly=true)
	@Override
	public Job findJobById(Integer id) {
		// TODO Auto-generated method stub
		return jobMapper.selectById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#findJob(domain.Job, util.tag.PageModel)
	 */
	@Transactional(readOnly=true)
	@Override
	public List<Job> findJob(Job job, PageModel pageModel) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see service.Service#addJob(domain.Job)
	 */
	@Override
	public void addJob(Job job) {
		// TODO Auto-generated method stub
		jobMapper.save(job);
	}

	/* (non-Javadoc)
	 * @see service.Service#removeJobById(java.lang.Integer)
	 */
	@Override
	public void removeJobById(Integer id) {
		// TODO Auto-generated method stub
		jobMapper.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#modifyJob(domain.Job)
	 */
	@Override
	public void modifyJob(Job job) {
		// TODO Auto-generated method stub
		jobMapper.update(job);
	}

	/* (non-Javadoc)
	 * @see service.Service#findNoticeById(java.lang.Integer)
	 */
	@Transactional(readOnly=true)
	@Override
	public Notice findNoticeById(Integer id) {
		// TODO Auto-generated method stub
		return noticeMapper.selectById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#findNotice(domain.Notice, util.tag.PageModel)
	 */
	@Transactional(readOnly=true)
	@Override
	public List<Notice> findNotice(Notice notice, PageModel pageModel) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see service.Service#addNotice(domain.Notice)
	 */
	@Override
	public void addNotice(Notice notice) {
		// TODO Auto-generated method stub
		noticeMapper.save(notice);
	}

	/* (non-Javadoc)
	 * @see service.Service#removeNoticeById(java.lang.Integer)
	 */
	@Override
	public void removeNoticeById(Integer id) {
		// TODO Auto-generated method stub
		noticeMapper.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#modifyNotice(domain.Notice)
	 */
	@Override
	public void modifyNotice(Notice notice) {
		// TODO Auto-generated method stub
		noticeMapper.update(notice);
	}

	/* (non-Javadoc)
	 * @see service.Service#findDocumentById(java.lang.Integer)
	 */
	@Transactional(readOnly=true)
	@Override
	public Document findDocumentById(Integer id) {
		// TODO Auto-generated method stub
		return documentMapper.selectById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#findDocument(domain.Document, util.tag.PageModel)
	 */
	@Transactional(readOnly=true)
	@Override
	public List<Document> findDocument(Document document, PageModel pageModel) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see service.Service#addDocument(domain.Document)
	 */
	@Override
	public void addDocument(Document document) {
		// TODO Auto-generated method stub
		documentMapper.save(document);
	}

	/* (non-Javadoc)
	 * @see service.Service#removeDocumentById(java.lang.Integer)
	 */
	@Override
	public void removeDocumentById(Integer id) {
		// TODO Auto-generated method stub
		documentMapper.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see service.Service#modifyDocument(domain.Document)
	 */
	@Override
	public void modifyDocument(Document document) {
		// TODO Auto-generated method stub
		documentMapper.update(document);
	}

}
