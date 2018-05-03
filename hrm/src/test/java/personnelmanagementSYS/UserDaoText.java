/**
 * 
 */
package personnelmanagementSYS;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DeptMapper;
import domain.Dept;

/**
 * @ClassName:  UserDaoText   
 * @Description:TODO  
 * @author: 
 * @date:   2018年2月1日 上午1:06:40 
 */
public class UserDaoText {

	/**
	 * @Description: TODO  
	 * @param: @throws java.lang.Exception            
	 */
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		Dept dept= new Dept();
		dept.setName("测试");
		dept.setRemark("just test2");
		dept.setId(8);
		DeptMapper mapper=(DeptMapper)applicationContext.getBean("deptMapper");
		mapper.deleteById(8);
		
		
		
	}

}
