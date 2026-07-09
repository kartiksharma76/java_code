package sorting;

import java.util.Arrays;

public class MaximumGap {
	static int maximumGap(int[] nums) {
		if (nums.length < 2)
			return 0;

		Arrays.sort(nums);

		int maxGap = 0;

		for (int i = 1; i < nums.length; i++) {
			maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
		}
		return maxGap;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 6, 9, 1 };

		System.out.println(maximumGap(nums));
	}
}
