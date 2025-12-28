package Practicesheet;

/**
 * 1. Java Program to Get Input from the User
2. Java Program to Swap Two Numbers
3. Java Program to Add Two Complex number
4. Java Program to Check Even or Odd Integers
5. Java Program to Find Largest Among 3 Numbers
6. Java Program to Display All Prime Numbers from 1 to N
7. Java Program to Check whether input character is vowel or consonant
8. Java Program to Find Factorial of a number
9. Java Program to Find Even Sum of Fibonacci Series Till number N
10. Java Program to Calculate Simple Interest
 */
import java.util.Scanner;

public class BasicProgramme {
//1.get input from user

	static void getUserInput(Scanner sc) {
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Hello," + name);
	}

//2.Swap two number
	static void swapNumber(Scanner sc) {
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: a=" + a + ",b=" + b);

	}

// 3.Add two complex numbers
	static void addComplex(Scanner sc) {
		System.out.print("Enter real part of first complex number: ");
		int r1 = sc.nextInt();
		System.out.print("Enter imaginary part of first complex number: ");

		int i1 = sc.nextInt();
		System.out.print("Enter real part of second complex number: ");
		int r2 = sc.nextInt();
		System.out.print("Enter imaginary part of second complex number: ");
		int i2 = sc.nextInt();

		System.out.println("Sum = " + (r1 + r2) + " + " + (i1 + i2) + "i");
	}

// 4.Even Odd
	static void evenOdd(Scanner sc) {
		int n = sc.nextInt();

		if (n % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");

	}

//5.Largest among 3 numbers
	static void largestOfThree(Scanner sc) {
		System.out.println("Eneter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int largest = (a > b && a > c) ? a : (b > c ? b : c);
		System.out.println("Largest number: " + largest);

	}

//6. Prime numbers from 1 to N
	static void primeNumbers(Scanner sc) {
		System.out.print("Enter N: ");
		int n = sc.nextInt();

		System.out.println("Prime numbers:");
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.print(i + " ");
		}
		System.out.println();
	}

// 7. Vowel or Consonant
	static void vowelOrConsonant(Scanner sc) {
		System.out.print("Enter a character: ");
		char ch = sc.next().toLowerCase().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}

// 8. Factorial
	static void factorial(Scanner sc) {
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		long fact = 1;

		for (int i = 1; i <= n; i++)
			fact *= i;

		System.out.println("Factorial = " + fact);
	}

//9. Even sum of Fibonacci series till N
	static void evenFibonacciSum(Scanner sc) {
		System.out.print("Enter N: ");
		int n = sc.nextInt();

		int a = 0, b = 1, sum = 0;

		while (b <= n) {
			if (b % 2 == 0)
				sum += b;
			int temp = a + b;
			a = b;
			b = temp;
		}
		System.out.println("Even Fibonacci Sum = " + sum);
	}

// 10. Simple Interest

	static void simpleInterest(Scanner sc) {
		System.out.print("Enter Principal, Rate, Time: ");
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float t = sc.nextFloat();

		float si = (p * r * t) / 100;
		System.out.println("Simple Interest = " + si);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Program (1-10): ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1 -> getUserInput(sc);
		case 2 -> primeNumbers(sc);
		case 3 -> addComplex(sc);
		case 4 -> evenOdd(sc);
		case 5 -> largestOfThree(sc);
		case 6 -> primeNumbers(sc);
		case 7 -> vowelOrConsonant(sc);
		case 8 -> factorial(sc);
		case 9 -> evenFibonacciSum(sc);
		case 10 -> simpleInterest(sc);
		default -> System.out.println("Invalid choice");
		}

		sc.close();
	}
}
