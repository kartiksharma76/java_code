package encapsulation;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;

		} else {
			System.out.println("age can  not be negative.");
		}

	}
}
