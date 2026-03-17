package litcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums);
		return result;
	}

	private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
		// Base case: If the current list matches the input length, we found a
		// permutation
		if (temp.size() == nums.length) {
			result.add(new ArrayList<>(temp));
			return;
		}

		for (int num : nums) {
			// Skip if the number is already in the current permutation path
			if (temp.contains(num))
				continue;

			temp.add(num); // Choose
			backtrack(result, temp, nums); // Explore
			temp.remove(temp.size() - 1); // Un-choose (Backtrack)
		}
	}

	public static void main(String[] args) {
		Permutations p = new Permutations();
		int[] nums = { 1, 2, 3 };

		List<List<Integer>> result = p.permute(nums);

		System.out.println("Permutations of [1, 2, 3]:");
		for (List<Integer> list : result) {
			System.out.println(list);
		}
	}
}