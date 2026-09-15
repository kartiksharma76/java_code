package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		if (s.length() < p.length())
			return result;
		int[] pCount = new int[26], sCount = new int[26];
		for (char c : p.toCharArray())
			pCount[c - 'a']++;
		for (int i = 0; i < p.length(); i++)
			sCount[s.charAt(i) - 'a']++;
		if (Arrays.equals(pCount, sCount))
			result.add(0);

		for (int i = p.length(); i < s.length(); i++) {
			sCount[s.charAt(i) - 'a']++;
			sCount[s.charAt(i - p.length()) - 'a']--;
			if (Arrays.equals(pCount, sCount))
				result.add(i - p.length() + 1);
		}
		return result;

	}

	public static void main(String[] args) {
		FindAllAnagrams sol = new FindAllAnagrams();
		System.out.println(sol.findAnagrams("cbaebabacd", "abc"));
	}
}
