package DsaQuestions.Adobe;

public class MedianTwoSortedArrays {
    public static double findMedianSortedArray(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArray(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        while (left <= right) {
            int partition1 = (left + right) / 2;
            int partition2 = (m + n + 1) / 2 - partition1;

            int left1 = partition1 == 0 ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int right1 = partition1 == m ? Integer.MAX_VALUE : nums1[partition1];

            int left2 = partition2 == 0 ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int right2 = partition2 == n ? Integer.MAX_VALUE : nums2[partition2];


            if (left1 <= right2 && left2 <= right1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;

                } else {
                    return Math.max(left1, left2);
                }
            }
            if (left1 > right2) {
                right = partition1 - 1;
            } else {
                left = partition1 + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted");

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double result = findMedianSortedArray(nums1, nums2);
        System.out.println("Median = " + result);
    }
}
