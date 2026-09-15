package litcode;
/**
 * Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

	public static List<List<Integer>> permuteUnique(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(nums);

		boolean[] used = new boolean[nums.length];

		backtrack(nums, used, new ArrayList<>(), result);

		return result;
	}

	public static void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {

		if (current.size() == nums.length) {
			result.add(new ArrayList<>(current));
			return;
		}

		for (int i = 0; i < nums.length; i++) {

			if (used[i]) {
				continue;
			}

			// Skip duplicate
			if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
				continue;
			}

			used[i] = true;
			current.add(nums[i]);

			backtrack(nums, used, current, result);

			current.remove(current.size() - 1);
			used[i] = false;
		}
	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2 };

		List<List<Integer>> result = permuteUnique(nums);

		System.out.println(result);
	}
}