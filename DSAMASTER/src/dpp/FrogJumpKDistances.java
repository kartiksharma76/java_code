package dpp;

public class FrogJumpKDistances {
    public int minCost(int[] heights, int k) {
        int n = heights.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                int cost = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                dp[i] = Math.min(dp[i], cost);
            }
        }
        return dp[n - 1];
    }
}
