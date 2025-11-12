package collagetest;

public class StudentRecordTest {
	public static void main(String[] args) {
		StudentRecord rc = new StudentRecord("KartikeySharma", 113, "SIRT", 78282012, 7.24);
		System.out.println(rc.getStudentName());
		System.out.println(rc.getStudentId());
		System.out.println(rc.getStudentCollage());
		System.out.println(rc.getMobileNo());
		System.out.println(rc.getCGPA());
	}
}
