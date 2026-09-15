package nqttop150;

import java.util.HashMap;
import java.util.Map;

public class ValidWindowParanthisis {
	private String s;
	private String t;

	public ValidWindowParanthisis(String s, String t) {
		this.s = s;
		this.t = t;
	}

	public String findMinWindow() {
		if (s == null || t == null || s.length() < t.length()) {
			return "";
		}
		return findWindowHelper(s, t);
	}

	private String findWindowHelper(String s, String t) {
		Map<Character, Integer> targetCount = new HashMap<>();
		for (char c : t.toCharArray()) {
			targetCount.put(c, targetCount.getOrDefault(c, 0) + 1);
		}

		Map<Character, Integer> window = new HashMap<>();
		int left = 0, right = 0;
		int minLen = Integer.MAX_VALUE, minStart = 0;
		int have = 0, need = targetCount.size();

		while (right < s.length()) {
			char c = s.charAt(right);
			window.put(c, window.getOrDefault(c, 0) + 1);

			if (targetCount.containsKey(c) && window.get(c).intValue() == targetCount.get(c).intValue()) {
				have++;
			}

			while (have == need) {
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					minStart = left;
				}

				char leftChar = s.charAt(left);
				window.put(leftChar, window.get(leftChar) - 1);
				if (targetCount.containsKey(leftChar) && window.get(leftChar) < targetCount.get(leftChar)) {
					have--;
				}
				left++;
			}

			right++;
		}

		return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
	}

	public static void main(String[] args) {
		String s = "OUZODYXAZV";
		String t = "XYZ";

		ValidWindowParanthisis mws = new ValidWindowParanthisis(s, t);
		System.out.println("Output: \"" + mws.findMinWindow() + "\"");
	}
}
