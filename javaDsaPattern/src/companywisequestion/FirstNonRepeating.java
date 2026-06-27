package companywisequestion;

import java.util.LinkedHashMap;
import java.util.Map;

//Question:
//Text editor me first non-repeating character find karo.
public class FirstNonRepeating {
	public static void main(String[] args) {
		String text = "swiss";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : text.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (char ch : map.keySet()) {
			if (map.get(ch) == 1) {
				System.out.println("First Non-Repeating Character: " + ch);
				break;
			}
		}
	}
}
