package domain;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable {
	private Integer id;
	private String title;
	private String content;
	private Date createdate;
	private User user;
	
	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", content=" + content + ", createdate=" + createdate
				+ ", user=" + user + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Notice() {
		super();
	}

}
