package javaDsaPattern;

public class Kadane {
	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int current = nums[0];

		for (int i = 1; i < nums.length; i++) {
			current = Math.max(nums[i], current + nums[i]);
			maxSum = Math.max(maxSum, current);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));
	}
}
