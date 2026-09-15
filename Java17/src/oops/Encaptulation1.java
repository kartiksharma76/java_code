package oops;

class Human {
	private String name;
	private int age;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Name:" + name + ",Age:" + age);
	}
}

public class Encaptulation1 {
	public static void main(String[] args) {
		Human h = new Human("Kartik", 20);
		h.display();
		h.setAge(22);
		h.display();
	}
}
