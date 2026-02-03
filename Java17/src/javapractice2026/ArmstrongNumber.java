package javapractice2026;

import java.util.Scanner;
/**
 * int n = 153, s = 0, t = n;
while (n > 0) {
    int d = n % 10;
    s += d * d * d;
    n /= 10;
}
System.out.println(s == t ? "Armstrong" : "Not Armstrong");

 */
public class ArmstrongNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();

		int original = num;
		int digits = 0;
		int sum = 0;

		int temp = num;
		while (temp != 0) {
			digits++;
			temp /= 10;
		}

		temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
			temp /= 10;
		}

		if (sum == original) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
