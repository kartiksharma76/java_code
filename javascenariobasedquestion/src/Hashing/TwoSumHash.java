package Hashing;

import java.util.HashMap;

public class TwoSumHash {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (map.containsKey(comp))
				return new int[] { map.get(comp), i };
			map.put(nums[i], i);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		TwoSumHash sol = new TwoSumHash();
		int[] res = sol.twoSum(new int[] { 3, 2, 4 }, 6);
		System.out.println(res[0] + ", " + res[1]); // 1, 2
	}
}