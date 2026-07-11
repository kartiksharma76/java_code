package dpp;

public class FrogJump {
    public int minCost(int[] heights) {
        int n = heights.length;
        int[] dp = new int[n];
        dp[0] = 0;
        if (n > 1) dp[1] = Math.abs(heights[1] - heights[0]);
        for (int i = 2; i < n; i++) {
            int oneStep = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int twoStep = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[n - 1];
    }
}
