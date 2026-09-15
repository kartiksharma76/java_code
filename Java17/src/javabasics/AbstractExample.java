package javabasics;

abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("Dog barks");

	}

}

class Lion extends Animal {

	@Override
	void sound() {
		System.out.println("lion roars");

	}

}

public class AbstractExample {
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		a.sound();

		a = new Lion();
		a.sound();
	}
}
