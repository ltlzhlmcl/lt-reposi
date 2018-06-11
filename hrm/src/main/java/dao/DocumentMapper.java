/**
 * 
 */
package dao;

import java.util.List;

import domain.Document;

/**
 * @ClassName:  DocumentMapper   
 * @Description:TODO  
 * @author: 
 * @date:   2018年5月16日 下午10:14:38 
 */
public interface DocumentMapper {
	List<Document> selectByPage();
	Document selectById(Integer id);
	void save(Document doc);
	void update(Document doc);
	void deleteById(Integer id);
}
