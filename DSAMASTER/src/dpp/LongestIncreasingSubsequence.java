package dpp;

import java.util.*;

public class LongestIncreasingSubsequence {
    // O(n^2) DP approach
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int best = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            best = Math.max(best, dp[i]);
        }
        return best;
    }

    // O(n log n) binary search approach
    public int lengthOfLISFast(int[] nums) {
        List<Integer> tails = new ArrayList<>();
        for (int n : nums) {
            int idx = Collections.binarySearch(tails, n);
            if (idx < 0) idx = -(idx + 1);
            if (idx == tails.size()) tails.add(n);
            else tails.set(idx, n);
        }
        return tails.size();
    }
}
