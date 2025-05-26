package litcode;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,3], nums2 = [2] Output: 2.00000 Explanation: merged array =
 * [1,2,3] and median is 2. Example 2:
 * 
 * Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000 Explanation: merged array
 * = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 * 
 * Constraints:
 * 
 * nums1.length == m nums2.length == n 0 <= m <= 1000 0 <= n <= 1000 1 <= m + n
 * <= 2000 -106 <= nums1[i], nums2[i] <= 106
 */
public class MidiamOfTwoSortedArray {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1 = nums1.length, n2 = nums2.length;
		int[] result = new int[n1 + n2];
		int i = 0, j = 0, k = 0;

		// Merge both arrays
		while (i < n1 && j < n2) {
			if (nums1[i] <= nums2[j]) {
				result[k++] = nums1[i++];
			} else {
				result[k++] = nums2[j++];
			}
		}
		while (i < n1) {
			result[k++] = nums1[i++];
		}
		while (j < n2) {
			result[k++] = nums2[j++];
		}

		// Find median
		int total = result.length;
		if (total % 2 == 1) {
			return result[total / 2]; // Odd length
		} else {
			return (result[total / 2 - 1] + result[total / 2]) / 2.0; // Even length
		}
	}

	// Example usage
	public static void main(String[] args) {
		MidiamOfTwoSortedArray s = new MidiamOfTwoSortedArray();
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		System.out.println("Median: " + s.findMedianSortedArrays(nums1, nums2));
	}
}
