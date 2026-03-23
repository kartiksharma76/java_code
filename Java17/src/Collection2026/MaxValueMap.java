package Collection2026;

import java.util.Collections;
import java.util.HashMap;

public class MaxValueMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 50);
		map.put("C", 30);

		int max = Collections.max(map.values());
		System.out.println("Max Value: " + max);
	}
}
