package arrays;

public class PalindromeArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 1 };

		boolean isPalindrome = true;

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			if (arr[start] != arr[end]) {
				isPalindrome = false;
				break;
			}

			start++;
			end--;
		}

		if (isPalindrome) {
			System.out.println("Array is Palindrome");
		} else {
			System.out.println("Array is Not Palindrome");
		}
	}
}
