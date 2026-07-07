package companywisequestion;

//Question:
//Array me pair find karo
//jinka sum target ke equal ho.

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				System.out.println("Indices: " + map.get(complement) + " " + i);
				return;
			}

			map.put(nums[i], i);
		}
	}
}