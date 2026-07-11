package dpp;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        if (total % 2 != 0) return false;
        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int n : nums) {
            for (int t = target; t >= n; t--) {
                dp[t] = dp[t] || dp[t - n];
            }
        }
        return dp[target];
    }
}
