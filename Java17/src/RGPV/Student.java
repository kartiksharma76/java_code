package RGPV;

public class Student {
	String name;
	int rollNo;

	public Student(int rollNo, String name) {
		this.name = name;
		this.rollNo = rollNo;

	}

	public void display() {
		System.out.println("name:" + name + "rollNo:" + rollNo);
	}
}
