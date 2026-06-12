package string;

import java.util.Arrays;

public class PermutationInString {
	public boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;
		int[] p1 = new int[26], p2 = new int[26];
		for (char c : s1.toCharArray())
			p1[c - 'a']++;
		for (int i = 0; i < s1.length(); i++)
			p2[s2.charAt(i) - 'a']++;
		if (Arrays.equals(p1, p2))
			return true;
		for (int i = s1.length(); i < s2.length(); i++) {
			p2[s2.charAt(i) - 'a']++;
			p2[s2.charAt(i - s1.length()) - 'a']--;
			if (Arrays.equals(p1, p2))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		PermutationInString sol = new PermutationInString();
		System.out.println(sol.checkInclusion("ab", "eidbaooo")); // true
	}
}