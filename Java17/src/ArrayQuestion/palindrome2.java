package ArrayQuestion;

public class palindrome2 {
	public static boolean isPalindrome(int num) {
		int original = num;
		int reversed = 0;
		while (num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		return original == reversed;

	}

	public static boolean isPalindrome(int[] arr) {
		for (int num : arr) {
			if (!isPalindrome(num)) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		if (isPalindrome(arr)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
