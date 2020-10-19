package gradle_mybatis_spring_study.dto;

import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private Address address;
	private PhoneNumber phone;
	private List<Course> courses;

	
	
	
	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Tutor(int tutorId, String name, String email, Address address, List<Course> courses) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.courses = courses;
	}

	
	public Tutor(int tutorId, String name, String email, Address address) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.address = address;
	}


	public Tutor(int tutorId2, String name2, String email2, PhoneNumber phone, Address address2) {
		// TODO Auto-generated constructor stub
	}


	public int getTutorId() {
		return tutorId;
	}

	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return String.format("Tutor [%s, %s, %s, %s, %s]", tutorId, name, email, address, courses);
	}

}
