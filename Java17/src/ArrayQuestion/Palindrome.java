package ArrayQuestion;

public class Palindrome {
	public static boolean ispalindrome(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		if (ispalindrome(arr)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
