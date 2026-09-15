package strings;

public class StringToInteger {

	public static void main(String[] args) {

		String str = "   -42";

		int i = 0;
		int n = str.length();

		// Skip leading spaces
		while (i < n && str.charAt(i) == ' ') {
			i++;
		}

		int sign = 1;

		// Check sign
		if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {

			if (str.charAt(i) == '-') {
				sign = -1;
			}

			i++;
		}

		int result = 0;

		// Convert digits
		while (i < n && Character.isDigit(str.charAt(i))) {

			int digit = str.charAt(i) - '0';

			// Check overflow
			if (result > (Integer.MAX_VALUE - digit) / 10) {

				if (sign == 1) {
					result = Integer.MAX_VALUE;
				} else {
					result = Integer.MIN_VALUE;
				}

				System.out.println("Integer: " + result);
				return;
			}

			result = result * 10 + digit;
			i++;
		}

		System.out.println("Integer: " + (result * sign));
	}
}