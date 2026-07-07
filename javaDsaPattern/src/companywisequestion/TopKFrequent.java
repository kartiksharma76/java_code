package companywisequestion;

//Question:
//Top K frequent search queries find karni hain.

import java.util.*;

public class TopKFrequent {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 2, 3 };

		int k = 2;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {

			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

		for (int num : map.keySet()) {

			pq.offer(num);

			if (pq.size() > k) {
				pq.poll();
			}
		}

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}