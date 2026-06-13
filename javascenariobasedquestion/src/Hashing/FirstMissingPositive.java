package Hashing;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n; i++)
			while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i])
				swap(nums, i, nums[i] - 1);
		for (int i = 0; i < n; i++)
			if (nums[i] != i + 1)
				return i + 1;
		return n + 1;
	}

	private void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		FirstMissingPositive sol = new FirstMissingPositive();
		System.out.println(sol.firstMissingPositive(new int[] { 3, 4, -1, 1 })); // 2

	}
}
