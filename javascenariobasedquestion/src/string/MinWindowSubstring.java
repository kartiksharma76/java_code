package string;

import java.util.HashMap;

public class MinWindowSubstring {
	public String minWindow(String s, String t) {
		HashMap<Character, Integer> need = new HashMap<>();
		for (char c : t.toCharArray())
			need.merge(c, 1, Integer::sum);
		int left = 0, formed = 0, required = need.size();
		int[] ans = { -1, 0, 0 };
		HashMap<Character, Integer> window = new HashMap<>();
		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			window.merge(c, 1, Integer::sum);
			if (need.containsKey(c) && window.get(c).equals(need.get(c)))
				formed++;
			while (formed == required) {
				if (ans[0] == -1 || right - left + 1 < ans[0]) {
					ans[0] = right - left + 1;
					ans[1] = left;
					ans[2] = right;
				}
				char lc = s.charAt(left);
				window.merge(lc, -1, Integer::sum);
				if (need.containsKey(lc) && window.get(lc) < need.get(lc))
					formed--;
				left++;
			}
		}
		return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	}

	public static void main(String[] args) {
		MinWindowSubstring sol = new MinWindowSubstring();
		System.out.println(sol.minWindow("ADOBECODEBANC", "ABC"));
	}
}
