package litcode;

import java.util.Arrays;

public class PlusTwo {
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}
 
	public static void main(String[] args) {
		int[] digits = { 1, 2, 9 };
		int[] result = plusOne(digits);
		System.out.println(Arrays.toString(result));
	}
}
