package javascenariobasedquestion;

/**
 * The next permutation of an array of integers is the next lexicographically
 * greater permutation of its integer. Given an array of integers nums, find the
 * next permutation of nums. The replacement must be in place and use only
 * constant extra memory.
 */
public class PermutationUpdater {
	/**
	 * Start Find the first index i from the right such that nums[i] < nums[i+1]. If
	 * such an index exists: Find the first index j from the right such that nums[j]
	 * > nums[i]. Swap nums[i] and nums[j]. Reverse the subarray from i+1 to the
	 * end. Print/return the modified array. Stop.
	 */

	public static void nextPermutation(int[] nums) {
		int i = nums.length - 2;
		// find pivot
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}
		// Find element just greater than pivot
		if (i >= 0) {
			int j = nums.length - 1;

			while (nums[j] <= nums[i]) {
				i--;
			}
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;

		}

		// reverse remaining

		int left = i + 1;
		int right = nums.length - 1;

		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;

			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		nextPermutation(nums);
		System.out.print("Next Permutation: [");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);

			if (i < nums.length - 1)
				System.out.print(", ");
		}

		System.out.println("]");
	}
}
