package DsaImp;

public class FindMedianSortedArrays { // Class name should follow PascalCase
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] merged = new int[m + n];
		int i = 0, j = 0, k = 0;
		// Merge both arrays
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				merged[k++] = nums1[i++];
			} else {
				merged[k++] = nums2[j++];
			}
		}
		// Copy remaining elements from nums1 (if any)
		while (i < m) {
			merged[k++] = nums1[i++];
		}
		// Copy remaining elements from nums2 (if any)
		while (j < n) {
			merged[k++] = nums2[j++];
		}
		// Now compute median — AFTER full merge
		int len = merged.length;
		if (len % 2 == 1) {
			return (double) merged[len / 2]; // Middle element
		} else {
			return (merged[len / 2 - 1] + merged[len / 2]) / 2.0; // Average of two middle
		}
	}
	public static void main(String[] args) {
		FindMedianSortedArrays sol = new FindMedianSortedArrays();
		System.out.println(sol.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 })); // 2.0
		System.out.println(sol.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 })); // 2.5
		System.out.println(sol.findMedianSortedArrays(new int[] {}, new int[] { 1 })); // 1.0
	}
}