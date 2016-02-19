package s10338.hellocontroller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

	private String studentName;
	private String studentHobby;
	private Long studentMobile;
	private Date studentDOB;
	private List<String> studentSkills;
	private Address studentAddress;
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public List<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

}
