package DsaQuestions.Hardestproblem;


public class CountRangeSum {

    public static int countRangeSum(int[] nums, int lower, int upper) {

        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return mergeSort(prefix, 0, n, lower, upper);
    }

    private static int mergeSort(long[] sums, int left, int right, int lower, int upper) {

        if (left >= right) return 0;

        int mid = left + (right - left) / 2;

        int count = mergeSort(sums, left, mid, lower, upper) + mergeSort(sums, mid + 1, right, lower, upper);

        int low = mid + 1;
        int high = mid + 1;

        for (int i = left; i <= mid; i++) {

            while (low <= right && sums[low] - sums[i] < lower) {
                low++;
            }

            while (high <= right && sums[high] - sums[i] <= upper) {
                high++;
            }

            count += high - low;
        }

        long[] temp = new long[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (sums[i] <= sums[j]) {
                temp[k++] = sums[i++];
            } else {
                temp[k++] = sums[j++];
            }
        }

        while (i <= mid) temp[k++] = sums[i++];
        while (j <= right) temp[k++] = sums[j++];

        System.arraycopy(temp, 0, sums, left, temp.length);

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 5, -1};

        System.out.println(countRangeSum(nums, -2, 2));
        // Output: 3
    }
}
