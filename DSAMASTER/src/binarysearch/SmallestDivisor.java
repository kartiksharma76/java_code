package binarysearch;

public class SmallestDivisor {

	static int sum(int[] nums, int divisor) {

		int total = 0;

		for (int num : nums)
			total += (num + divisor - 1) / divisor;

		return total;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 5, 9 };
		int threshold = 6;

		int left = 1;
		int right = 9;
		int ans = right;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (sum(nums, mid) <= threshold) {
				ans = mid;
				right = mid - 1;
			} else
				left = mid + 1;
		}

		System.out.println(ans);
	}
}