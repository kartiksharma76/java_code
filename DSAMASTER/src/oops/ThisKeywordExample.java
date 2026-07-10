package oops;

class Person {

	String name;

	Person(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(name);
	}
}

public class ThisKeywordExample {

	public static void main(String[] args) {

		Person p = new Person("Kartik");

		p.display();
	}
}