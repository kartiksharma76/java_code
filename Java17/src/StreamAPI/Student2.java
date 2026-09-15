package StreamAPI;

import java.time.LocalDate;

public class Student2 {
	private int sid;
	private String name;
	private LocalDate birthday;
	private String gender;
	private String maritalStatus;
	private LocalDate admissionDate;
	private String department;
	private String courseName;
	private long fees;
	private String campusLocation;

	public Student2(int sid, String name, LocalDate birthday, String gender, String maritalStatus,
			LocalDate admissionDate, String department, String courseName, long fees, String campusLocation) {
		super();
		this.sid = sid;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.admissionDate = admissionDate;
		this.department = department;
		this.courseName = courseName;
		this.fees = fees;
		this.campusLocation = campusLocation;

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public String getCampusLocation() {
		return campusLocation;
	}

	public void setCampusLocation(String campusLocation) {
		this.campusLocation = campusLocation;
	}

}
