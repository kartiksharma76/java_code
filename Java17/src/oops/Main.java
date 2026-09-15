package oops;

abstract class Animal {
	abstract void makeSound();

	void sleep() {
		System.out.println("sleeping....");
	}

}

class Dog extends Animal {

	@Override
	void makeSound() {
		System.out.println("Bark!");

	}

}

public class Main {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.makeSound();
		myDog.sleep();
	}
}
