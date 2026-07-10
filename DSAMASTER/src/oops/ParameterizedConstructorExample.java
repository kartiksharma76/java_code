package oops;

class Student1 {
	String name;
	int age;

	Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println(name + " " + age);
	}
}

public class ParameterizedConstructorExample {
	public static void main(String[] args) {
		Student1 s = new Student1("Kartik", 21);
		s.display();
	}
}
