package Practicesheet;

public class SumProductDigit {
	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		int product = 1;

		while (n > 0) {
			int digit = n % 10;
			sum = sum + digit;
			product = product * digit;
			n = n / 10;
		}

		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
	}
}