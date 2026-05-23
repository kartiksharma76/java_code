package InfosysSpringboard;

class CheckPalindrome {
	public static boolean checkPalindrome(String str) {
		// Reverse the string and compare it with the original
		String reversed = new StringBuilder(str).reverse().toString();

		if (str.equals(reversed)) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		String str = "radar";
		if (checkPalindrome(str)) {
			System.out.println("The string is a palindrome!");
		} else {
			System.out.println("The string is not a palindrome!");
		}
	}
}