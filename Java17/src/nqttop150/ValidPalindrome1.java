package nqttop150;

public class ValidPalindrome1 {
	public static boolean isPalindrome(String s) {
		String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int left = 0;
		int right = cleaned.length() - 1;
		while (left < right) {
			if (cleaned.charAt(left) != cleaned.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

	public static void main(String[] args) {
		String s = "tab a cat";
		boolean result = isPalindrome(s);
		System.out.println(result);
	}
}
