package gradle_mybatis_spring_study.dto;

import java.util.Date;

public class Course {
	private int courseId;
	private String courseName;
	private String description;
	private Date startDate;
	private Date endDate;
	private int tutorId;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", description=" + description + ", startDate=" + startDate + ", endDate="
				+ endDate + ", tutorId=" + tutorId + "]";
	}
	
	
}
