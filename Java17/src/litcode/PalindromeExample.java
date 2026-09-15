package litcode;
/**
 ------------------------------
| Step | x   |digit  |reverse  |
| ---- | --- | ----- | ------- |
| 1    | 121 | 1     | 1       |
| 2    | 12  | 2     | 12      |
| 3    | 1   | 1     | 121     |
 ------------------------------
 */
public class PalindromeExample {
	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int real = x;
		int reverse = 0;

		while (x > 0) {
			int digit = x % 10;
			reverse = reverse * 10 + digit;
			x = x / 10;
		}
		return real == reverse;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
}
