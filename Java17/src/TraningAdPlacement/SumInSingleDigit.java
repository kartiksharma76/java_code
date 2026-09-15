package TraningAdPlacement;

import java.util.Scanner;

public class SumInSingleDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		System.out.println("Enter number :");
		int n = sc.nextInt();

		while (n > 9) {
			sum = 0;
			while (n > 0) {
				sum += n % 10;

				n /= 10;
			}
			n = sum;
		}
		System.out.println("SingleDight sum =" + n);
	}
}
