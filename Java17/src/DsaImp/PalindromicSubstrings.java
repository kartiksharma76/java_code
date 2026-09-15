package DsaImp;

public class PalindromicSubstrings {
	public static int countSubStrings(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count += expendArountCenter(s, i, i);
			count += expendArountCenter(s, i, i + 1);
		}
		return count;
	}

	private static int expendArountCenter(String s, int left, int right) {
		int count = 0;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++;
			left--;
			right++;
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(countSubStrings("abc"));
		System.out.println(countSubStrings("aaa"));

		System.out.println(countSubStrings("aba"));

		System.out.println(countSubStrings("racecar"));
		System.out.println(countSubStrings("a"));

		System.out.println(countSubStrings(""));

	}
}
