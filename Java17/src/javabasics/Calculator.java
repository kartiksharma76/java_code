package javabasics;

public class Calculator {
	public int addition(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = calculator.addition(50, 60);
		System.out.println(sum);
		int sub = calculator.subtract(90, 40);
		System.out.println(sub);
		int div = calculator.divide(40, 20);
		System.out.println(div);
		int multiply = calculator.multiply(20, 20);
		System.out.println(multiply);
	}

}
