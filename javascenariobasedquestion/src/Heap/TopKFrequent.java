package Heap;

import java.util.*;

public class TopKFrequent {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> freq = new HashMap<>();
		for (int n : nums)
			freq.merge(n, 1, Integer::sum);
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));
		for (int num : freq.keySet()) {
			pq.add(num);
			if (pq.size() > k)
				pq.poll();
		}
		int[] res = new int[k];
		for (int i = k - 1; i >= 0; i--)
			res[i] = pq.poll();
		return res;
	}

	public static void main(String[] args) {
		TopKFrequent sol = new TopKFrequent();
		int[] res = sol.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);
		for (int x : res)
			System.out.print(x + " "); // 1 2
	}
}
