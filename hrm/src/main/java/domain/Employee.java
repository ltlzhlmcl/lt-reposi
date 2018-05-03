package domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee implements Serializable {
	private Dept dept;
	private Job job;
	private String name;
	private String cardId;
	private String address;
	private String postCode;
	private String tel;
	private String phone;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date birthday;
	private String race;
	private String education;
	private String speciality;
	private String remark;
	
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", job=" + job + ", name=" + name + ", cardId=" + cardId + ", address="
				+ address + ", postCode=" + postCode + ", tel=" + tel + ", phone=" + phone + ", birthday=" + birthday
				+ ", race=" + race + ", education=" + education + ", speciality=" + speciality + ", remark=" + remark
				+ ", qq=" + qq + ", email=" + email + ", sex=" + sex + ", party=" + party + "]";
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	private String qq;
	private String email;
	private Integer sex;
	private String party;
	public Employee() {
		super();
	}

}
