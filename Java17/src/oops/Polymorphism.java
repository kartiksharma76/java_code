package oops;

class Calculator {
	public int add(int a, int b) {
		return a + b;

	}

	public double add(double a, double b) {
		return a + b;

	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 10));
		System.out.println(cal.add(5.5, 10.10));
	}
}
