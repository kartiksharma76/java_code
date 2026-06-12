package string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharsByFrequency {
	public String frequencySort(String s) {
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : s.toCharArray())
			freq.merge(c, 1, Integer::sum);
		PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
		pq.addAll(freq.keySet());
		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			char c = pq.poll();
			for (int i = 0; i < freq.get(c); i++)
				sb.append(c);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		SortCharsByFrequency sol = new SortCharsByFrequency();
		System.out.println(sol.frequencySort("tree")); // "eert" or "eetr"
	}
}
