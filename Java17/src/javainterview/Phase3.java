package javainterview;

public class Phase3 {
	public static void main(String[] args) {

		// 1. Print 1 to 10
		System.out.println("1 to 10:");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// 2. Reverse 10 to 1
		System.out.println("\n\n10 to 1:");
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}

		// 3. Even numbers 1 to 100
		System.out.println("\n\nEven numbers:");
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}

		// 4. Odd numbers 1 to 100
		System.out.println("\n\nOdd numbers:");
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
		}

		// 5. Multiplication Table
		int num = 5;
		System.out.println("\n\nTable of " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + " = " + (num * i));
		}

		// 6. Factorial
		int factNum = 5;
		int fact = 1;
		for (int i = 1; i <= factNum; i++) {
			fact *= i;
		}
		System.out.println("\nFactorial = " + fact);

		// 7. Factorial 1 to n
		int n = 5;
		System.out.println("\nFactorial from 1 to " + n);
		for (int i = 1; i <= n; i++) {
			int f = 1;
			for (int j = 1; j <= i; j++) {
				f *= j;
			}
			System.out.println(i + "!=" + f);
		}

		// 8. Prime numbers 1 to 100
		System.out.println("\nPrime numbers");
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(i + " ");
			}
		}

		// 9. Check prime
		int check = 7;
		int c = 0;
		for (int i = 1; i <= check; i++) {
			if (check % i == 0)
				c++;
		}
		if (c == 2)
			System.out.println("\n\nPrime");
		else
			System.out.println("\n\nNot Prime");

		// 10. Fibonacci
		int terms = 7;
		int a = 0, b = 1;
		System.out.println("\nFibonacci:");
		for (int i = 1; i <= terms; i++) {
			System.out.println(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}

		a = 0;
		b = 1;
		int sumFib = 0;
		for (int i = 1; i <= terms; i++) {
			sumFib += a;
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println("\nSum of Fibonacci = " + sumFib);

		// 12. Factors
		int num1 = 12;
		System.out.println("\nFactors:");
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0)
				System.out.print(i + " ");
		}

		// 13. Sum of factors
		int sumFactors = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0)
				sumFactors += i;
		}
		System.out.println("\nSum of factors = " + sumFactors);

		// 14. HCF
		int x = 12, y = 18;
		int hcf = 1;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0)
				hcf = i;
		}
		System.out.println("\nHCF = " + hcf);

		// 15. LCM

		int lcm = (x * y) / hcf;
		System.out.println("LCM = " + lcm);

		// 16. Square 1 to n
		System.out.println("\nSquares:");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " -> " + (i * i));
		}
		// 17. Cube 1 to n
		System.out.println("\nCubes:");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " -> " + (i * i * i));
		}

		// 18. Divisible by 7
		int a1 = 1, b1 = 100;
		System.out.println("\nDivisible by 7:");
		for (int i = a1; i <= b1; i++) {
			if (i % 7 == 0)
				System.out.print(i + " ");
		}

		// 19. Sum of first n natural numbers
		int sumN = 0;
		for (int i = 1; i <= n; i++) {
			sumN += i;
		}
		System.out.println("\n\nSum = " + sumN);

		// 20. Sum of even numbers
		int evenSum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				evenSum += i;
		}
		System.out.println("Even sum = " + evenSum);

		// 21. Sum of odd numbers
		int oddSum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0)
				oddSum += i;
		}
		System.out.println("Odd sum = " + oddSum);
	}
}
