package oops;

class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}
}

public class SingleInheritanceExample {
	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.eat();
		dog.bark();
	}
}
