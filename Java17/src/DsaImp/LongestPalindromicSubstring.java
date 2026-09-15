package DsaImp;

public class LongestPalindromicSubstring {
	public static String LongPalindromicSubstring(String s) {
		if (s == null || s.length() < 1)
			return " ";

		int start = 0, maxLength = 0;

		for (int i = 0; i < s.length(); i++) {
			int len1 = expendAroundCenter(s, i, i);

			int len2 = expendAroundCenter(s, i, i + 1);

			int len = Math.max(len1, len2);

			if (len > maxLength) {
				maxLength = len;
				start = i - (len - 1) / 2;
			}
		}
		return s.substring(start, start + maxLength);

	}

	private static int expendAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	public static void main(String[] args) {
		System.out.println(LongPalindromicSubstring("babad"));
		System.out.println(LongPalindromicSubstring("cbbd"));
		System.out.println(LongPalindromicSubstring("racecar"));
		System.out.println(LongPalindromicSubstring("a"));
		System.out.println(LongPalindromicSubstring("babad"));
		System.out.println(LongPalindromicSubstring("abb"));

	}
}
