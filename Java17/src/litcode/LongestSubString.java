package litcode;

import java.util.HashSet;

public class LongestSubString {
	public static int lengthofsubstring(String s) {
		int n = s.length();

		int maxlength = 0;
		int j = 0;
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			while (set.contains(s.charAt(i))) {
				set.remove(s.charAt(j));
				j++;
			}
			set.add(s.charAt(i));
			maxlength = Math.max(maxlength, i - j + 1);

		}
		return maxlength;

	}

	public static void main(String[] args) {
		String input = "abcabcbb";
		int length = lengthofsubstring(input);
		System.out.println("length of longest substring :"+length);
	}
}
