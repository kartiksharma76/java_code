package litcode;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	public static void main(String[] args) {
		String str = "banana";
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		System.out.println(map);
	}
}
