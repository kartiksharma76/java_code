package twopointering;

// Sort Colors (Dutch National Flag Algorithm)
public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) { swap(nums, low++, mid++); }
            else if (nums[mid] == 1) { mid++; }
            else { swap(nums, mid, high--); }
        }
    }
    private void swap(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }
}
