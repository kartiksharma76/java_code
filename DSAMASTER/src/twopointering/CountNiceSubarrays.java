package twopointering;

public class CountNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    private int atMost(int[] nums, int k) {
        if (k < 0) return 0;
        int left = 0, oddCount = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) oddCount++;
            while (oddCount > k) {
                if (nums[left] % 2 != 0) oddCount--;
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
