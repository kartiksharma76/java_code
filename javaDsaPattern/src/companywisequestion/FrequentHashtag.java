package companywisequestion;

//Question:
//Social media app me most frequent hashtag find karna hai.

import java.util.HashMap;

public class FrequentHashtag {

	public static void main(String[] args) {
		String[] tags = { "#java", "#ai", "#java", "#dsa", "#java", "#ai" };
		HashMap<String, Integer> map = new HashMap<>();

		for (String tag : tags) {
			map.put(tag, map.getOrDefault(tag, 0) + 1);
		}

		String ans = "";
		int max = 0;

		for (String tag : map.keySet()) {
			if (map.get(tag) > max) {

				max = map.get(tag);
				ans = tag;
			}
		}

		System.out.println("Most Frequent: " + ans);
	}
}