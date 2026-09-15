package javascenariobasedquestion;

/**
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a subarray whose sum is greater than or equal to
 * target. If there is no such subarray, return O instead.
 */
class SubarrayLengthFinder {
	/**
	 * Start Initialize: left = 0 sum = 0 minLength = Integer.MAX_VALUE Traverse the
	 * array using right. Add nums[right] to sum. While sum >= target: Update
	 * minLength. Remove nums[left] from sum. Increment left. After traversal: If
	 * minLength is unchanged, return 0. Otherwise return minLength. Stop.
	 * 
	 * @param target
	 * @param nums
	 * @return
	 */
	public static int minSubArrayLen(int target, int[] nums) {

		int left = 0;
		int sum = 0;
		int minLength = Integer.MAX_VALUE;

		for (int right = 0; right < nums.length; right++) {

			sum += nums[right];

			while (sum >= target) {

				minLength = Math.min(minLength, right - left + 1);

				sum -= nums[left];
				left++;
			}
		}

		return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
	}

	public static void main(String[] args) {

		int target = 7;
		int[] nums = { 2, 3, 1, 2, 4, 3 };

		System.out.println("Minimum Length = " + minSubArrayLen(target, nums));
	}
}
