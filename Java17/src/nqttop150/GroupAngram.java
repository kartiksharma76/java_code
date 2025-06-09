package nqttop150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAngram {
	public static void main(String[] args) {
		String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
		List<List<String>> grouped = groupedAngram(strs);
		System.out.println(grouped);
	}

	private static List<List<String>> groupedAngram(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String w : strs) {
			char[] chars = w.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
		}
		return new ArrayList<>(map.values());
	}
}
