package javabasics;

public class Calculator {
	
	public static  int addition(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public static  int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = Calculator.addition(50, 60);
		System.out.println(sum);
		int sub = calculator.subtract(90, 40);
		System.out.println(sub);
		int div = Calculator.divide(40, 20);
		System.out.println(div);
		int multiply = calculator.multiply(20, 20);
		System.out.println(multiply);
	}

}
