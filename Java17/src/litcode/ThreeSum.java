package litcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums); // Step 1: Sort the array
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {
			// Step 2: Skip duplicate values for i
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int target = -nums[i];
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[left] + nums[right];

				if (sum == target) {
					// Found a triplet
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					// Skip duplicate values at left and right
					while (left < right && nums[left] == nums[left + 1])
						left++;
					while (left < right && nums[right] == nums[right - 1])
						right--;

					left++;
					right--;
				} else if (sum < target) {
					left++; // Need a bigger sum
				} else {
					right--; // Need a smaller sum
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		ThreeSum solution = new ThreeSum();

		int[] nums = { -1, 0, 1, 2, -1, -4 };

		List<List<Integer>> triplets = solution.threeSum(nums);

		System.out.println("Unique triplets that sum to 0:");
		for (List<Integer> triplet : triplets) {
			System.out.println(triplet);
		}
	}
}
