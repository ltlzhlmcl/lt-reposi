/**
 * 
 */
package dao;

import java.util.List;

import domain.Notice;

/**
 * @ClassName:  NoticeMapper   
 * @Description:TODO  
 * @author: 
 * @date:   2018年5月16日 下午9:09:24 
 */
public interface NoticeMapper {
	List<Notice> selectByPage();
	Notice selectById(Integer id);
	void save(Notice not);
	void update(Notice not);
	void deleteById(Integer id);
}
