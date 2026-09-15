package oops;

class StudentRecord {

	private int rollNumber;
	private String studentName;

	public StudentRecord(int rollNumber, String studentName) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}

	public void display() {
		System.out.println(rollNumber + " " + studentName);
	}
}

public class StudentRecordExample {

	public static void main(String[] args) {

		StudentRecord student = new StudentRecord(101, "Kartik");

		student.display();
	}
}