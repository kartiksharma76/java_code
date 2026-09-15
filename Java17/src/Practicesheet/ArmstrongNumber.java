package Practicesheet;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum = sum + digit * digit * digit;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}
