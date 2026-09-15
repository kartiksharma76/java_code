package searchingandsorting;

public class KthLargest {
	public int findKthLargest(int[] nums, int k) {
		return quickSelect(nums, 0, nums.length - 1, nums.length - k);
	}

	private int quickSelect(int[] nums, int left, int right, int k) {
		int pivot = nums[right], ptr = left;
		for (int i = left; i < right; i++)
			if (nums[i] <= pivot)
				swap(nums, ptr++, i);
		swap(nums, ptr, right);
		if (ptr == k)
			return nums[ptr];
		return ptr < k ? quickSelect(nums, ptr + 1, right, k) : quickSelect(nums, left, ptr - 1, k);
	}

	private void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		KthLargest sol = new KthLargest();
		System.out.println(sol.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2)); // 5
	}
}