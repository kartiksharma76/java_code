package dpp;

import java.util.*;

public class PrintLongestIncreasingSubsequence {
    public List<Integer> printLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n], parent = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);
        int bestIdx = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            if (dp[i] > dp[bestIdx]) bestIdx = i;
        }
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = bestIdx; i != -1; i = parent[i]) res.addFirst(nums[i]);
        return res;
    }
}
