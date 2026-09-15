package Inheritance;

public class Complex {
	private double real, imag;

	public Complex(double r, double i) {
		real = r;
		imag = i;
	}

	// Overloading the + operator
	public Complex add(Complex c) {
		Complex temp = new Complex(0, 0);
		temp.real = real + c.real;
		temp.imag = imag + c.imag;
		return temp;
	}

	public void display() {
		System.out.println(real + " + i" + imag);
	}
}
