package companywisequestion;

//Question:
//Chat application me message palindrome hai ya nahi check karna hai.
public class PalindromeCheck {
	public static void main(String[] args) {
		String message = "madam";

		int left = 0;
		int right = message.length() - 1;
		boolean isPalindrome = true;

		while (left < right) {
			if (message.charAt(left) != message.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}
		System.out.println("Palindrome: " + isPalindrome);

	}
}
