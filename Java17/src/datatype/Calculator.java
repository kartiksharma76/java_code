package datatype;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2, result = 0;
		char Operator;
		System.out.println("Enter First number:");
		num1 = scanner.nextDouble();
		System.out.println("Enter Operator(+,-,*,/):");
		Operator = scanner.next().charAt(0);
		System.out.println("Enter second number:");
		num2 = scanner.nextDouble();
		switch (Operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("can not be divide:");
				return;
			}
			break;
		default:
			System.out.println("invalid operator:");
			return;
		}
		System.out.println(num1 + " " + Operator + " " + num2 + " = " + result);
	}
}
