package Google.com;

/**
 * Enter a number: 8987
8987 is a Jumping Number.
Enter limit:  50
Jumping numbers up to 50:
0 1 2 3 4 5 6 7 8 9 10 12 21 23 32 34 43 45 
 */
import java.util.Scanner;

public class JumpingNumber {
	public static boolean isJumpingNumber(int num) {
		if (num < 10) {
			return true;
		}
		int prevDigit = num % 10;
		num /= 10;

		while (num > 0) {
			int currDigit = num % 10;
			if (Math.abs(currDigit - prevDigit) != 1) {
				return false;
			}
			prevDigit = currDigit;
			num /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if (isJumpingNumber(n)) {
			System.out.println(n + " is a Jumping Number.");
		} else {
			System.out.println(n + " is NOT a Jumping Number.");
		}

		System.out.print("Enter limit: ");
		int limit = sc.nextInt();
		System.out.println("Jumping numbers up to " + limit + ":");
		for (int i = 0; i <= limit; i++) {
			if (isJumpingNumber(i)) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}