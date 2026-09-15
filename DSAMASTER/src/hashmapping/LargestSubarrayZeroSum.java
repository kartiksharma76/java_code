package hashmapping;

import java.util.*;

// Contiguous Array (equal 0s and 1s) / Largest subarray with 0 sum
public class LargestSubarrayZeroSum {
    public int maxLenZeroSum(int[] nums) {
        Map<Integer, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0, -1);
        int sum = 0, best = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (firstIndex.containsKey(sum)) {
                best = Math.max(best, i - firstIndex.get(sum));
            } else {
                firstIndex.put(sum, i);
            }
        }
        return best;
    }

    // Contiguous Array: treat 0 as -1, find longest subarray with sum 0
    public int findMaxLength(int[] nums) {
        int[] transformed = new int[nums.length];
        for (int i = 0; i < nums.length; i++) transformed[i] = nums[i] == 0 ? -1 : 1;
        return maxLenZeroSum(transformed);
    }
}
