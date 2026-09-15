package litcode;
/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product
of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 

Constraints:

1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.

 */
public class MultiplyStrings {
	public static String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		int[] result = new int[num1.length() + num2.length()];

		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {

				int n1 = num1.charAt(i) - '0';
				int n2 = num2.charAt(j) - '0';

				int product = n1 * n2;

				int pos1 = i + j;
				int pos2 = i + j + 1;

				int sum = product + result[pos2];

				result[pos2] = sum % 10;
				result[pos1] += sum / 10;
			}
		}

		StringBuilder ans = new StringBuilder();

		for (int digit : result) {

			if (ans.length() == 0 && digit == 0) {
				continue;
			}
			ans.append(digit);
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "456";

		String result = multiply(num1, num2);

		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
		System.out.println("Product = " + result);
	}
}
