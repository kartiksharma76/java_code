package Inheritance;

public class Animal {
	public void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog barks");
	}
}
