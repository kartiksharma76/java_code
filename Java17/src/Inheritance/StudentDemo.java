package Inheritance;

public class StudentDemo {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.inputDetails();
		student1.printDetails();

		Student student2 = new Student("kartik".toCharArray(), 85.0f, 90.0f, 88.0f);
		student2.printDetails();
	}
}
