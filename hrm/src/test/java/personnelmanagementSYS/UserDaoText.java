/**
 * 
 */
package personnelmanagementSYS;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DocumentMapper;
import domain.Document;
import domain.User;

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
		Document doc=new Document();
		doc.setRemark("test reamark");
		doc.setId(2);
		doc.setTitle("test tiltle");
		doc.setFilename("test filename");
		User user= new User();
		user.setId(1);
		doc.setUser(user);
		
		DocumentMapper mapper=(DocumentMapper)applicationContext.getBean("documentMapper");
		mapper.save(doc);
		
	}

}
