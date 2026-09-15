package javabasics;

class Stu {
	private int marks = 100;

	private void showMarks() {
		System.out.println(marks);
	}

	public void display() {
		showMarks();
	}
}

public class PrivateEx {
	public static void main(String[] args) {
		Stu student = new Stu();
		student.display();
	}
}
