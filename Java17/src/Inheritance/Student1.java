package Inheritance;

interface book {
	void book();
}

interface subject {
	void subject();
}

public class Student1 implements book, subject {

	@Override
	public void subject() {
		System.out.println(" i like math ");

	}

	@Override
	public void book() {
		System.out.println("i like math book");

	}

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.book();
		s.subject();
	}

}
