package Inheritance;

public class Main {
	public static void main(String[] args) {
		Complex c1 = new Complex(10, 5);
		Complex c2 = new Complex(2, 4);

		Complex c3 = c1.add(c2); // Using the overloaded + operator

		System.out.print("First Complex number: ");
		c1.display();

		System.out.print("Second Complex number: ");
		c2.display();

		System.out.print("Sum of two complex number: ");
		c3.display();
	}
}
