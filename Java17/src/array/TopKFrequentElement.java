package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> count = new HashMap<>();

		// Count frequency
		for (int num : nums) {
			count.put(num, count.getOrDefault(count, 0) + 1);
		}
		// Store (frequency, number)
		List<int[]> arr = new ArrayList<>();

		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			arr.add(new int[] { entry.getValue(), entry.getKey() });
		}
		// Sort descending by frequency
		arr.sort((a, b) -> b[0] - a[0]);

		// Pick top k
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = arr.get(i)[1];
		}
		return res;
	}

	public static void main(String[] args) {
		TopKFrequentElement obj = new TopKFrequentElement();
		int[] nums = { 1, 1, 2, 2, 3 };
		int k = 2;

		int[] result = obj.topKFrequent(nums, k);
		System.out.println("Top K Frequent Elements:");
		for (int num : result) {
			System.out.print(num + " ");
		}

	}
}
