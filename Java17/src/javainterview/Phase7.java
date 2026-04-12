package javainterview;

public class Phase7 {

	public static void main(String[] args) {

		int n = 100;

		// 1. Numbers 1–100 whose digit sum is even
		System.out.println("1. Digit sum even:");
		for (int i = 1; i <= 100; i++) {
			int temp = i, sum = 0;
			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum % 2 == 0)
				System.out.print(i + " ");
		}

		// 2. Count numbers divisible by 7 but not 5
		int count = 0;
		for (int i = 1; i <= 500; i++) {
			if (i % 7 == 0 && i % 5 != 0)
				count++;
		}
		System.out.println("\n\n2. Count = " + count);

		// 3. Palindrome numbers 1–500
		System.out.println("\n3. Palindrome:");
		for (int i = 1; i <= 500; i++) {
			int temp = i, rev = 0;
			while (temp != 0) {
				rev = rev * 10 + temp % 10;
				temp /= 10;
			}
			if (i == rev)
				System.out.print(i + " ");
		}

		// 4. Digit sum multiple of 3
		System.out.println("\n\n4. Digit sum multiple of 3:");
		for (int i = 1; i <= 100; i++) {
			int temp = i, sum = 0;
			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum % 3 == 0)
				System.out.print(i + " ");
		}

		// 5. Binary representation with even number of 1s
		System.out.println("\n\n5. Even 1s in binary:");
		for (int i = 1; i <= n; i++) {
			int temp = i, ones = 0;
			while (temp != 0) {
				if (temp % 2 == 1)
					ones++;
				temp /= 2;
			}
			if (ones % 2 == 0)
				System.out.print(i + " ");
		}

		// 6. Pattern i*i
		System.out.println("\n\n6. Pattern (i*i):");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * i);
		}

		// 7. Sum of even & odd digits
		int num = 12345;
		int evenSum = 0, oddSum = 0;
		int temp = num;

		while (temp != 0) {
			int d = temp % 10;
			if (d % 2 == 0)
				evenSum += d;
			else
				oddSum += d;
			temp /= 10;
		}
		System.out.println("\n7. Even sum = " + evenSum);
		System.out.println("   Odd sum = " + oddSum);

		// 8. Armstrong numbers 1–1000
		System.out.println("\n8. Armstrong:");
		for (int i = 1; i <= 1000; i++) {
			int temp1 = i, digits = 0;

			while (temp1 != 0) {
				digits++;
				temp1 /= 10;
			}

			temp1 = i;
			int sum = 0;
			while (temp1 != 0) {
				int d = temp1 % 10;
				sum += Math.pow(d, digits);
				temp1 /= 10;
			}

			if (sum == i)
				System.out.print(i + " ");
		}

		// 9. Perfect numbers 1–1000
		System.out.println("\n\n9. Perfect numbers:");
		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					sum += j;
			}
			if (sum == i)
				System.out.print(i + " ");
		}

		// 10. Max digit sum number
		int maxSum = 0, number = 0;

		for (int i = 1; i <= n; i++) {
			int temp2 = i, sum = 0;
			while (temp2 != 0) {
				sum += temp2 % 10;
				temp2 /= 10;
			}
			if (sum > maxSum) {
				maxSum = sum;
				number = i;
			}
		}

		System.out.println("\n\n10. Max digit sum number = " + number);
		System.out.println("    Digit sum = " + maxSum);
	}
}