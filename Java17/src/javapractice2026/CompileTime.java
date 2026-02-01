package javapractice2026;

class Animal1 {
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog1 extends Animal1 {
	void sound() {
		System.out.println("DogBarks");
	}
}

public class CompileTime {
	public static void main(String[] args) {
		Animal1 a = new Dog1();
		a.sound();
	}
}
