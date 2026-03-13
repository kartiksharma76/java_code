package litcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();

		for (String s : strs) {

			char[] chars = s.toCharArray();
			Arrays.sort(chars);

			String key = new String(chars);

			map.putIfAbsent(key, new ArrayList<>());

			map.get(key).add(s);
		}

		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {

		GroupAnagrams obj = new GroupAnagrams();

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<List<String>> result = obj.groupAnagrams(strs);

		System.out.println(result);
	}
}