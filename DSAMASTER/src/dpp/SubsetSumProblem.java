package dpp;

public class SubsetSumProblem {
    public boolean subsetSum(int[] nums, int target) {
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
