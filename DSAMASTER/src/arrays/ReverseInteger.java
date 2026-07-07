package arrays;

public class ReverseInteger {
	public static void main(String[] args) {
		int num = 12345;
		int reverse = 0;

		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reversed Number :" + reverse);
	}
}
