package TraningAdPlacement;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		int temp;
		int digit;
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		temp = n;

		while (temp > 0) {
			digit = temp % 10;
			rev = rev * 10 + digit;
			temp /= 10;

		}
		if (rev == n) {
			System.out.println("Palindrome Number :");

		} else {
			System.out.println("Not Palindrome");
		}
	}
}
