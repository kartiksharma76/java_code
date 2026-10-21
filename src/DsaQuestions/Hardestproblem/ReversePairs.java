package DsaQuestions.Hardestproblem;

public class ReversePairs {
    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);

    }

    static int mergeSort(int[] a, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(a, left, mid) + mergeSort(a, mid + 1, right);

        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) a[i] > 2L * a[j]) {
                j++;
            }
            count += j - (mid + 1);
        }
        merge(a, left, mid, right);
        return count;
    }

    static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) temp[k++] = a[i++];
        while (j <= right) temp[k++] = a[j++];
        System.arraycopy(temp, 0, a, left, temp.length);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};
        System.out.println(reversePairs(nums));
    }
}
