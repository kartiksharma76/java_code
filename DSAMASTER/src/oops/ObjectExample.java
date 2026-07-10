package oops;

class Employee {

	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}
}

public class ObjectExample {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.id = 101;
		e1.name = "Kartik";

		e2.id = 102;
		e2.name = "Rahul";

		e1.display();
		e2.display();
	}
}
