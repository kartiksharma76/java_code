package javainterview;

public class Phase1 {

	public static void main(String[] args) {

		int n = 5;
		int num = 1234;
		int a = 10, b = 50;
		int x = 12, y = 18;

		print1to10();
		printReverse10to1();
		printEven1to100();
		printOdd1to100();
		multiplicationTable(n);
		sumNatural(n);
		sumEven(n);
		sumOdd(n);
		factorial(n);
		productOfDigits(num);
		countDigits(num);
		reverseNumber(num);
		palindrome(121);
		sumOfDigits(num);
		armstrong(153);
		perfectNumber(28);
		primes1to100();
		primeCheck(29);
		fibonacci(n);
		sumFibonacci(n);
		squares(n);
		cubes(n);
		divisibleBy7(a, b);
		factors(x);
		sumFactors(x);
		hcf(x, y);
		lcm(x, y);
		smallestDigit(num);
		largestDigit(num);
	}

	// Q1
	public static void print1to10() {
		System.out.print("Q1: Numbers from 1 to 10 -> ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// Q2
	public static void printReverse10to1() {
		System.out.print("Q2: Numbers from 10 to 1 -> ");
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// Q3
	public static void printEven1to100() {
		System.out.print("Q3: Even numbers (1-100) -> ");
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// Q4
	public static void printOdd1to100() {
		System.out.print("Q4: Odd numbers (1-100) -> ");
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// Q5
	public static void multiplicationTable(int n) {
		System.out.println("Q5: Multiplication Table of " + n);
		for (int i = 1; i <= 10; i++) {
			System.out.println("   " + n + " x " + i + " = " + (n * i));
		}
	}

	// Q6
	public static void sumNatural(int n) {
		int sum = n * (n + 1) / 2;
		System.out.println("Q6: Sum of first " + n + " natural numbers = " + sum);
	}

	// Q7
	public static void sumEven(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i += 2) {
			sum += i;
		}
		System.out.println("Q7: Sum of even numbers up to " + n + " = " + sum);
	}

	// Q8
	public static void sumOdd(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i += 2) {
			sum += i;
		}
		System.out.println("Q8: Sum of odd numbers up to " + n + " = " + sum);
	}

	// Q9
	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Q9: Factorial of " + n + " = " + fact);
	}

	// Q10
	public static void productOfDigits(int n) {
		int prod = 1, temp = n;
		while (n > 0) {
			prod *= n % 10;
			n /= 10;
		}
		System.out.println("Q10: Product of digits of " + temp + " = " + prod);
	}

	// Q11
	public static void countDigits(int n) {
		int count = 0, temp = n;
		while (n > 0) {
			count++;
			n /= 10;
		}
		System.out.println("Q11: Number of digits in " + temp + " = " + count);
	}

	// Q12
	public static void reverseNumber(int n) {
		int rev = 0, temp = n;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		System.out.println("Q12: Reverse of " + temp + " = " + rev);
	}

	// Q13
	public static void palindrome(int n) {
		int temp = n, rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		System.out.println("Q13: " + temp + " is " + (temp == rev ? "Palindrome" : "Not Palindrome"));
	}

	// Q14
	public static void sumOfDigits(int n) {
		int sum = 0, temp = n;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println("Q14: Sum of digits of " + temp + " = " + sum);
	}

	// Q15
	public static void armstrong(int n) {
		int temp = n, sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum += d * d * d;
			n /= 10;
		}
		System.out.println("Q15: " + temp + " is " + (temp == sum ? "Armstrong" : "Not Armstrong"));
	}

	// Q16
	public static void perfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		System.out.println("Q16: " + n + " is " + (sum == n ? "Perfect" : "Not Perfect"));
	}

	// Prime helper
	public static boolean isPrime(int n) {
		if (n < 2)     
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// Q17
	public static void primes1to100() {
		System.out.print("Q17: Prime numbers (1-100) -> ");
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// Q18
	public static void primeCheck(int n) {
		System.out.println("Q18: " + n + " is " + (isPrime(n) ? "Prime" : "Not Prime"));
	}

	// Q19
	public static void fibonacci(int n) {
		System.out.print("Q19: Fibonacci series -> ");
		int a = 0, b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
	}

	// Q20
	public static void sumFibonacci(int n) {
		int a = 0, b = 1, sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += a;
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println("Q20: Sum of Fibonacci series = " + sum);
	}

	// Q21
	public static void squares(int n) {
		System.out.print("Q21: Squares -> ");
		for (int i = 1; i <= n; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
	}

	// Q22
	public static void cubes(int n) {
		System.out.print("Q22: Cubes -> ");
		for (int i = 1; i <= n; i++) {
			System.out.print(i * i * i + " ");
		}
		System.out.println();
	}

	// Q23
	public static void divisibleBy7(int a, int b) {
		System.out.print("Q23: Numbers divisible by 7 -> ");
		for (int i = a; i <= b; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// Q24
	public static void factors(int n) {
		System.out.print("Q24: Factors of " + n + " -> ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// Q25
	public static void sumFactors(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		System.out.println("Q25: Sum of factors of " + n + " = " + sum);
	}

	// Q26
	public static void hcf(int a, int b) {
		int x = a, y = b;
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		System.out.println("Q26: HCF of " + a + " and " + b + " = " + x);
	}

	// Q27
	public static void lcm(int a, int b) {
		int x = a, y = b;
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		int hcf = x;
		System.out.println("Q27: LCM of " + a + " and " + b + " = " + (a * b) / hcf);
	}

	// Q28
	public static void smallestDigit(int n) {
		int min = 9, temp = n;
		while (n > 0) {
			min = Math.min(min, n % 10);
			n /= 10;
		}
		System.out.println("Q28: Smallest digit in " + temp + " = " + min);
	}

	// Q29
	public static void largestDigit(int n) {
		int max = 0, temp = n;
		while (n > 0) {
			max = Math.max(max, n % 10);
			n /= 10;
		}
		System.out.println("Q29: Largest digit in " + temp + " = " + max);
	}
}