package Inheritance;

public class Animal1 {
	public void eat() {
		System.out.println("Animal eat");
	}
}

class Dog1 extends Animal1 {
	public void bark() {
		System.out.println("Dog bark");
	}
}

class Puppy extends Dog1 {
	public void weep() {
		System.out.println("puppy weep");
	}
}