package oops;

class Animl {
	String name;

	public Animl(String name) {
		this.name = name;
	}

	void show() {
		System.out.println(" Animal Name:" + name);
	}
}

class Dog1 extends Animl {

	public Dog1(String name) {
		super(name);
	}

	void bark() {
		System.out.println(name + " is barking");
	}

}

public class Inheritance1 {
	public static void main(String[] args) {
		Dog1 d = new Dog1("Billu");
		d.show();
		d.bark();
	}
}
