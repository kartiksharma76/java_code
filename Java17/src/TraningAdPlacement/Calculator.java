package TraningAdPlacement;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char op;
		System.out.println("Enter two Number :");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("Enter operator (+, -, *, /): ");
		op = sc.next().charAt(0);

		switch (op) {
		case '+':
			System.out.println("sum =" + (a + b));
			break;
		case '-':
			System.out.println("Difference = " + (a - b));
			break;
		case '*':
			System.out.println("Product = " + (a * b));
			break;
		case '/':
			if (b != 0)
				System.out.println("Quotient = " + (a / b));
			else
				System.out.println("Division by zero not allowed");
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}

}
