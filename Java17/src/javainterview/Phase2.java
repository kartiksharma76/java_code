package javainterview;

public class Phase2 {
	public static void main(String[] args) {
		System.out.println("1 to 10:");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// 2. Multiplication Table
		int num = 5;
		System.out.println("\n\nTable of " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));

		}

		// 3.Sun until 0
		int[] arr1 = { 10, 20, 30, 0 };
		int sum = 0;
		for (int n : arr1) {
			if (n == 0)
				break;
			sum += n;
		}
		System.out.println("\nSum =" + sum);

		// 4. Largest until 0
		int[] arr2 = { 5, 15, 25, 2, 0 };
		int max = Integer.MIN_VALUE;
		for (int n : arr2) {
			if (n == 0)
				break;
			if (n > max)
				max = n;
		}
		System.out.println("Largest = " + max);

// Count digits
		int num1 = 12345;
		int count = 0, temp = num1;
		while (temp != 0) {
			temp /= 10;
			count++;
		}
		System.out.println("\nDigits = " + count);

// Reverse Number
		int rev = 0;
		temp = num1;
		while (temp != 0) {
			int d = temp % 10;
			rev = rev * 10 + d;
			temp /= 10;
		}
		System.out.println("Reverse = " + rev);

		// palindrome
		if (num1 == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		// 8. Armstrong
		int result = 0;
		temp = num1;
		int digits = count;

		while (temp != 0) {
			int d = temp % 10;
			result += Math.pow(d, digits);
			temp /= 10;
		}
		if (result == num1) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

		// 9. Factorial
		int factNum = 5;
		int fact = 1;
		for (int i = 1; i <= factNum; i++) {
			fact *= i;
		}
		System.out.println("\nFactorial = " + fact);

		// 10. Fibonacci
		int terms = 7;
		int a = 0, b = 1;
		System.out.print("\nFibonacci: ");
		for (int i = 1; i <= terms; i++) {
			System.out.println(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
		// 11. HCF
		int x = 12, y = 18;
		int hcf = 1;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				hcf = i;
			}
		}
		System.out.println("\n\nHCF = " + hcf);

		// 12. Menu Driven (simulated)
		int choice = 1; // predefined choice
		if (choice == 1) {
			int a1 = 10, b1 = 5;
			System.out.println("\nSum = " + (a1 + b1));
		} else if (choice == 2) {
			int a1 = 10, b1 = 5;
			System.out.println("Difference = " + (a1 - b1));
		}
		// 13. Count positive until negative
		int[] arr3 = { 5, 10, 15, -1 };
		int countPos = 0;
		for (int n : arr3) {
			if (n < 0)
				break;
			countPos++;
		}
		System.out.println("Positive count = " + countPos);

		// 14. Sum of digits
		int sumDigits = 0;
		temp = num1;
		while (temp != 0) {
			sumDigits += temp % 10;
			temp /= 10;
		}
		System.out.println("Sum of digits = " + sumDigits);

		// 15. Even & Odd digit sum
		int evenSum = 0, oddSum = 0;
		temp = num1;

		while (temp != 0) {
			int d = temp % 10;
			if (d % 2 == 0) {
				evenSum += d;
			} else {
				oddSum += d;
			}
			temp /= 10;
		}

		System.out.println("Even digit sum = " + evenSum);
		System.out.println("Odd digit sum = " + oddSum);
	}
}
