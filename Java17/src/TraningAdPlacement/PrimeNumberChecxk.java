package TraningAdPlacement;

import java.util.Scanner;

public class PrimeNumberChecxk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;

		System.out.println("Enter a number :");
		int n = sc.nextInt();

		if (n <= 1) {
			System.out.println("not Prime Number ");
			return;

		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 1;
				break;

			}

		}
		if (flag == 0) {
			System.out.println("Prime");

		} else {
			System.out.println("Not Prime");
		}

	}
}
