package litcode;

import java.util.HashMap;

public class SubArraySumEqualsK {
	public int subArraySum(int[] nums, int k) {
		// Map stores <PrefixSum, Frequency>
		HashMap<Integer, Integer> map = new HashMap<>();

		// Base case: a prefix sum of 0 has occurred once (for subarrays starting at
		// index 0)
		map.put(0, 1);

		int sum = 0;
		int count = 0;

		for (int num : nums) {
			sum += num;

			// If (current_sum - k) exists in map, it means there is a subarray ending here
			// that sums to k
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}

			// Update the frequency of the current prefix sum
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		SubArraySumEqualsK solution = new SubArraySumEqualsK();

		// Test Case 1: Simple positive integers
		// [1, 1, 1], k = 2 -> [1,1] (indices 0-1) and [1,1] (indices 1-2)
		int[] nums1 = { 1, 1, 1 };
		System.out.println("Test 1: " + solution.subArraySum(nums1, 2)); // Expected: 2

		// Test Case 2: Mixed positive and negative (where the Map is essential)
		// [1, 2, 3], k = 3 -> [1,2] and [3]
		int[] nums2 = { 1, 2, 3 };
		System.out.println("Test 2: " + solution.subArraySum(nums2, 3)); // Expected: 2

		// Test Case 3: Zeros and negatives
		// [3, 4, 7, 2, -3, 1, 4, 2], k = 7
		int[] nums3 = { 3, 4, 7, 2, -3, 1, 4, 2 };
		System.out.println("Test 3: " + solution.subArraySum(nums3, 7)); // Expected: 4
	}
}