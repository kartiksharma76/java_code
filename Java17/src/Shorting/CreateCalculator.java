package Shorting;

import java.util.Scanner;

public class CreateCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("simple calculator:");
		System.out.println("Enter first value:");
		double number1 = sc.nextDouble();

		System.out.println("enter operator(+,-,*,/):");
		char operator = sc.next().charAt(0);

		System.out.println("enetr second value:");
		double number2 = sc.nextDouble();

		double result;
		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println("result:" + result);
			break;

		case '-':
			result = number1 - number2;
			System.out.println("result:" + result);
			break;

		case '*':
			result = number1 + number2;
			System.out.println("result:" + result);
			break;
		case '/':
			if (number2 != 0) {
				result = number1 / number2;
				System.out.println("result:" + result);
			} else {
				System.out.println("Error: Division by zero!");
			}

		default:
			System.out.println("invalid operator!");
			break;
		}
		sc.close();
	}
}
