package Polymorphism;

public class Test {
	public static void main(String[] args) {
		Animal a = new Dog();// technical meaning of polymorphism a parent class reference can hold its child
								// class object
		Animal a1 = new Cow();
		a.eat();
		a1.eat();

	}
}
