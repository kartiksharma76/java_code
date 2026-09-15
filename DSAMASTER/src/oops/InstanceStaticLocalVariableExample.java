package oops;

class College {

	int rollNo; // Instance Variable
	static String college = "SIRT"; // Static Variable

	void show() {

		int marks = 95; // Local Variable

		System.out.println(rollNo);
		System.out.println(college);
		System.out.println(marks);
	}
}

public class InstanceStaticLocalVariableExample {
	public static void main(String[] args) {

		College c = new College();

		c.rollNo = 101;

		c.show();
	}
}
