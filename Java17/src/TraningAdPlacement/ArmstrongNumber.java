package TraningAdPlacement;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		int sum = 0;
		int digit;
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		temp = n;

		while (temp > 0) {
			digit = temp % 10;
			sum += digit * digit;
			temp /= 10;
		}
		if (sum == n) {
			System.out.println("Armstrong Number");

		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}
