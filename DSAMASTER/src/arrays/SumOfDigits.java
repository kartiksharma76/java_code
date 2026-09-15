package arrays;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			num = num / 10;

		}
		System.out.println("Sum of Digit: " + sum);
	}

}
