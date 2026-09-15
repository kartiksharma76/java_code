package Inheritance;

public class Animal2 {
	public void eat() {
		System.out.println("animal eat");
	}
}

class Dog2 extends Animal {
	public void bark() {
		System.out.println("dog barks");
	}
}

class cat extends Animal {
	public void meows() {
		System.out.println("cat meows");
	}
}