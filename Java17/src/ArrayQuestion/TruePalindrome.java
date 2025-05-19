package ArrayQuestion;

public class TruePalindrome {
	public static boolean isPalindrome(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (right > left) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;

		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		if (isPalindrome(arr)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
