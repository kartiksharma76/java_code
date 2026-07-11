package dpp;

public class CountSubsetsWithSumK {
    public int countSubsets(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int n : nums) {
            for (int t = target; t >= n; t--) {
                dp[t] += dp[t - n];
            }
        }
        return dp[target];
    }
}
