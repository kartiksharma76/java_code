package companywisequestion;

import java.util.HashSet;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "abcabcbb";
		HashSet<Character> set = new HashSet<>();
		int left = 0;
		int max = 0;

		for (int right = 0; right < str.length(); right++) {
			while (set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}

			set.add(str.charAt(right));
			max = Math.max(max, right - left + 1);
		}
		System.out.println(max);
	}
}
