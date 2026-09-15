package array2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeated {
	public static void main(String[] args) {
		String str = "aabbcdde";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : str.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		for (Map.Entry<Character, Integer> e : map.entrySet()) {

			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}
	}
}
