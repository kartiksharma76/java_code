package dpp;

public class PartitionArrayMinimizeDiff {
    public int minSubsetSumDifference(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        boolean[] dp = new boolean[total + 1];
        dp[0] = true;
        for (int n : nums) {
            for (int t = total; t >= n; t--) {
                dp[t] = dp[t] || dp[t - n];
            }
        }
        int best = Integer.MAX_VALUE;
        for (int s1 = 0; s1 <= total / 2; s1++) {
            if (dp[s1]) best = Math.min(best, total - 2 * s1);
        }
        return best;
    }
}
