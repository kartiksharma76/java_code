package javainterview;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
