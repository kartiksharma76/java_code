package array2026;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapByVlue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("A", 30);
		map.put("B", 10);
		map.put("C", 20);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}
