package litcode;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String s = "Java is great and Java is powerful";
		String[] words = s.split(" ");
		Map<String, Integer> map = new HashMap<>();

		for (String w : words)
			map.put(w, map.getOrDefault(w, 0) + 1);

		System.out.println(map);
	}
}