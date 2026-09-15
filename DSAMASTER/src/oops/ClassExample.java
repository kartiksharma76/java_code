package oops;

class Student {

	String name;
	int age;

	void display() {
		System.out.println(name + " " + age);
	}
}

public class ClassExample {

	public static void main(String[] args) {

		Student s = new Student();

		s.name = "Kartik";
		s.age = 21;

		s.display();
	}
}