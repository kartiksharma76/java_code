package collagetest;

public class StudentRecord {
	String studentName;
	int StudentId;
	String StudentCollage;
	long mobileNo;
	double CGPA;

	public StudentRecord(String studentName, int studentId, String studentCollage, long mobileNo, double d) {
		super();
		this.studentName = studentName;
		StudentId = studentId;
		StudentCollage = studentCollage;
		this.mobileNo = mobileNo;
		CGPA = d;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentCollage() {
		return StudentCollage;
	}

	public void setStudentCollage(String studentCollage) {
		StudentCollage = studentCollage;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}
}
