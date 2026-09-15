package litcode;

public class IsPalindromeExample {
	/**
	 * Input: x = -121 Output: false Explanation: -121 reads as -121 from left to
	 * right and from right to left.
	 */
	public static boolean isPalindrome(int[] x) {
		int n = x.length;
		for (int i = 0; i < n / 2; i++) {
			if (x[i] != x[n - i - 1]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int[] arr = { -1, 2, 1 };
		System.out.println(isPalindrome(arr));
	}
}
