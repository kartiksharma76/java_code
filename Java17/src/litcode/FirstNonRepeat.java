package litcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
	public static void main(String[] args) {
		String str = "swiss";
		Map<Character, Integer> freq = new LinkedHashMap<>();

		for (char c : str.toCharArray())
			freq.put(c, freq.getOrDefault(c, 0) + 1);

		for (Map.Entry<Character, Integer> e : freq.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println("First Non repeating :" + e.getKey());
				break;
			}

		}
	}
}
