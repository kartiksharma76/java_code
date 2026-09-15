package array2026;

import java.util.HashMap;
import java.util.Map;

public class FindHighestFrequencyElement {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 3, 3, 4 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int maxKey = 0;
		int maxFreq = 0;

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {

			if (e.getValue() > maxFreq) {
				maxFreq = e.getValue();
				maxKey = e.getKey();
			}
		}

		System.out.println(maxKey);
	}
}
