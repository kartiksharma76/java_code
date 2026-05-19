package javaDsaPattern;

import java.util.HashMap;

public class MinimumWindow {
	public static String minWindow(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int left = 0;
		int count = 0;
		int minLen = Integer.MAX_VALUE;
		int start = 0;

		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);

				if (map.get(ch) >= 0) {
					count++;
				}
			}
			while (count == t.length()) {
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					start = left;
				}

				char leftChar = s.charAt(left);

				if (map.containsKey(leftChar)) {
					map.put(leftChar, map.get(leftChar) + 1);

					if (map.get(leftChar) > 0) {
						count--;
					}
				}
				left++;
			}
		}
		if (minLen == Integer.MAX_VALUE) {
			return "";
		}
		return s.substring(start, start + minLen);
	}

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";

		System.out.println("Minimum Window = " + minWindow(s, t));
	}
}
