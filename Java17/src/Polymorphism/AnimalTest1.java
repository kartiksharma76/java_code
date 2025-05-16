package Polymorphism;

public class AnimalTest1 {
	public static void main(String[] args) {
		Animal1 a;
		a = new Dog1();
		a.sound();

		a = new Cat();
		a.sound();
	}
}
