package searchingandsorting;

public class MedianTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length)
			return findMedianSortedArrays(nums2, nums1);
		int m = nums1.length, n = nums2.length;
		int lo = 0, hi = m;
		while (lo <= hi) {
			int i = (lo + hi) / 2, j = (m + n + 1) / 2 - i;
			int maxL1 = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
			int minR1 = i == m ? Integer.MAX_VALUE : nums1[i];
			int maxL2 = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
			int minR2 = j == n ? Integer.MAX_VALUE : nums2[j];
			if (maxL1 <= minR2 && maxL2 <= minR1) {
				if ((m + n) % 2 == 0)
					return (Math.max(maxL1, maxL2) + Math.min(minR1, minR2)) / 2.0;
				return Math.max(maxL1, maxL2);
			} else if (maxL1 > minR2)
				hi = i - 1;
			else
				lo = i + 1;
		}
		return 0.0;
	}

	public static void main(String[] args) {
		MedianTwoSortedArrays sol = new MedianTwoSortedArrays();
		System.out.println(sol.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 })); // 2.0
	}
}
