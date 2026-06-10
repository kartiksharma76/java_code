package javascenariobasedquestion;

/**
 * You are given two integer arrays nums1 and nums2, sorted in nondecreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively. Merge nums1 and nums2 into single array sorted in
 * non-decreasing order.
 */
class ArrayMerger {
	/**
	 * Start Set three pointers: i = m - 1 (last valid element of nums1) j = n - 1
	 * (last element of nums2) k = m + n - 1 (last position of nums1) Compare
	 * nums1[i] and nums2[j]. Place the larger element at nums1[k]. Decrement the
	 * corresponding pointer and k. Repeat until one array is exhausted. Copy
	 * remaining elements of nums2 (if any). Print the merged array. Stop.
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {

			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}

			k--;
		}

		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		int m = 3;
		int n = 3;

		merge(nums1, m, nums2, n);

		System.out.print("Merged Array: [");

		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]);

			if (i < nums1.length - 1)
				System.out.print(", ");
		}

		System.out.println("]");
	}
}