package basicMaths;

public class CheckIfNumberIsArmstrong {
	public static void main(String[] args) {
		int num = 153;
		int original = num;

		int digits = String.valueOf(num).length();
		int sum = 0;

		while (num > 0) {

			int digit = num % 10;
			sum += Math.pow(digits, digits);
			num /= 10;

		}

		if (sum == original) {
			System.out.println(original + " is an Armstrong Number");
		} else {
			System.out.println(original + " is Not an Armstrong Number");
		}
	}
}
