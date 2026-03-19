package litcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums, 0);
		return result;
	}

	private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
		// Every state in the recursion tree is a valid subset
		result.add(new ArrayList<>(temp));

		for (int i = start; i < nums.length; i++) {
			temp.add(nums[i]); // Include nums[i]
			backtrack(result, temp, nums, i + 1); // Move to next element
			temp.remove(temp.size() - 1); // Exclude nums[i] (Backtrack)
		}
	}

	public static void main(String[] args) {
		Subsets s = new Subsets();
		int[] nums = { 1, 2, 3 };

		List<List<Integer>> allSubsets = s.subsets(nums);

		System.out.println("Total subsets: " + allSubsets.size()); // Should be 2^n = 8
		System.out.println("Subsets: " + allSubsets);
	}
}