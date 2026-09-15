package hashmapping;

import java.util.*;

// Count Number of Pairs With Absolute Difference K
public class CountPairsAbsDiffK {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            count += freq.getOrDefault(n - k, 0);
            count += freq.getOrDefault(n + k, 0);
            freq.merge(n, 1, Integer::sum);
        }
        return count;
    }
}
