package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAngarams {
	public List<List<String>> groupAngrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String sortedStr = new String(arr);
			map.putIfAbsent(sortedStr, new ArrayList<>());
			map.get(sortedStr).add(s);

		}
		return new ArrayList<>(map.values());

	}

	public static void main(String[] args) {
		GroupAngarams obj = new GroupAngarams();

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = obj.groupAngrams(strs);
		System.out.println(result);

	}
}
