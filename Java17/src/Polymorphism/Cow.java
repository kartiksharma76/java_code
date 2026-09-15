package Polymorphism;

import MyInheritance.GrandParent;

/**
 * NOTE -method signature == method name + argument list Rule 1. there must be a
 * inheritance relationship between Child and Parent Rule 2. Method name must be
 * same Rule 3. Argument list must be same Rule 4. Return type must be same or
 * covarient Return type(means same class/interface or its child/implementation
 * class) Rule 5. Access modifier might be same or must be higher scope access
 * modifier(private <default<protected<public) Rule 6. With respect to exception
 * will discuss in respective class
 */
public class Cow extends Animal {
	@Override
	public void eat() {
		System.out.println("grass");

	}

	// void speak()
	@Override
	public void speak() {
		System.out.println("maaa");
	}

	// protected Object getName()
	@Override
	public String getName() {
		return "ram pyari";
	}

	// public Integer getAge()
	@Override
	public Integer getAge() {
		return 20;
	}

	@Override
	public final void sleep(int hour, String place) {

	}

	public Son getParent() {
		return null;
	}

}
