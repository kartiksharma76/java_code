package javapractice2026;

public class Animal {
	void eat() {
		System.out.println("Animal eats");

	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}
