package litcode;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Arrays;

public class TopKFrequentElements {

	public int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		// Count frequency
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		// Max Heap based on frequency
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		pq.addAll(map.keySet());
		int[] result = new int[k];
		// Extract top k elements
		for (int i = 0; i < k; i++) {
			result[i] = pq.poll();
		}
		return result;
	}

	public static void main(String[] args) {
		TopKFrequentElements obj = new TopKFrequentElements();
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] result = obj.topKFrequent(nums, k);
		System.out.println(Arrays.toString(result));
	}
}