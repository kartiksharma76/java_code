package Polymorphism;

public class Animal1 {
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog1 extends Animal1 {
	@Override
	void sound() {
		System.out.println("dog bark");
	}
}

class Cat extends Animal1 {
	@Override
	void sound() {
		System.out.println("cat mews");
	}

}