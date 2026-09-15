package dpp;

public class ZeroOneKnapsack {
    public int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[] dp = new int[capacity + 1];
        for (int i = 0; i < n; i++) {
            for (int w = capacity; w >= weights[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - weights[i]] + values[i]);
            }
        }
        return dp[capacity];
    }
}
