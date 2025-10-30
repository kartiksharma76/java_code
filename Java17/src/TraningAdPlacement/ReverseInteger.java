package TraningAdPlacement;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		int digit = 0;
		System.out.println("Enter Number:");
		int n = sc.nextInt();

		while (n > 0) {
			digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		System.out.println("Reversed Number =" + rev);

	}

}
