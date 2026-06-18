package trenningjava;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person p = (Person) obj;

			return this.age == p.age && this.name.equals(p.name);
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}