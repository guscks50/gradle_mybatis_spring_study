package gradle_mybatis_spring_study.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private PhoneNumber Numberphone;
	private Date dob;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PhoneNumber getNumberphone() {
		return Numberphone;
	}
	public void setNumberphone(PhoneNumber numberphone) {
		Numberphone = numberphone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", email=" + email + ", Numberphone=" + Numberphone
				+ ", dob=" + dob + "]";
	}
	

	
	
}
