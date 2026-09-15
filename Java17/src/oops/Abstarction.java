package oops;

abstract class Animal1 {
	String name;

	Animal1(String name) {
		this.name = name;
	}

	abstract void sound();
}

class Cat extends Animal1 {

	Cat(String name) {
		super(name);

	}

	void sound() {
		System.out.println(name + " says Meow");
	}

}

public class Abstarction {
public static void main(String[] args) {
	   Cat c = new Cat("Kitty");
       c.sound();
}
}
