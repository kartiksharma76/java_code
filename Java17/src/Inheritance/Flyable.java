package Inheritance;

public interface Flyable {
	void fly();
}

interface swimmable {
	void swim();

}

class Duck implements Flyable, swimmable {

	@Override
	public void swim() {
		System.out.println("Duck is swimming");

	}

	@Override
	public void fly() {
		System.out.println("duck is fly");

	}

}