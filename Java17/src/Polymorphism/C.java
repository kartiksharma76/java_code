package Polymorphism;

public class C extends B {
	public void m1() {
		System.out.println("m1() of C");
	}

	public void m4() {
		System.out.println("m4() of C");
	}

	public static void main(String[] args) {
		A b = new B();// parent class reference can hold and class object.
		// a.m3();

	}
}
