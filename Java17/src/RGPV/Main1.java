package RGPV;

public class Main1 {
	public static void main(String[] args) {
		Student[] student = new Student[3];
		student[0] = new Student(113, "kartik");
		student[1] = new Student(117, "kaushal");
		student[2] = new Student(118, "kirtan");
		for (Student student1 : student) {
			student1.display();
		}
	}
}
