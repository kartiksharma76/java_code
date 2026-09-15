package DsaImp;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {
	public int lengthOfLongestSubString(String s) {
		int maxLen = 0;
		int left = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			if (map.containsKey(ch) && map.get(ch) >= left) {
				left = map.get(ch) + 1;
			}

			map.put(ch, right);
			maxLen = Math.max(maxLen, right - left + 1);

		}
		return maxLen;
	}

	public static void main(String[] args) {
		LengthOfLongestSubString sol = new LengthOfLongestSubString();
		System.out.println(sol.lengthOfLongestSubString("abcabcbb"));
		System.out.println(sol.lengthOfLongestSubString("bbbbb"));
		System.out.println(sol.lengthOfLongestSubString("pwwkew"));
		System.out.println(sol.lengthOfLongestSubString(""));
	}
}
