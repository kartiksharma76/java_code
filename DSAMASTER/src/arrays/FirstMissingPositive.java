package arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {

		int[] nums = { 3, 4, -1, 1 };

		int n = nums.length;

		// Place each number at its correct index
		for (int i = 0; i < n; i++) {

			while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {

				int temp = nums[i];
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;
			}
		}

		// Find the first missing positive
		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1) {
				System.out.println("First Missing Positive: " + (i + 1));
				return;
			}
		}

		System.out.println("First Missing Positive: " + (n + 1));
	}
}