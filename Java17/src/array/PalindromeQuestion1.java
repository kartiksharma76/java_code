package array;

public class PalindromeQuestion1 {
	public static boolean ispalindrome(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] != arr[n - i - 1]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(ispalindrome(arr));
	}
}
