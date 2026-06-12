package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = new String(ca);
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
		}
		return new ArrayList<>(map.values());

	}

	public static void main(String[] args) {
		GroupAnagrams sol = new GroupAnagrams();
		System.out.println(sol.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
		// [[eat,tea,ate],[tan,nat],[bat]]
	}
}
