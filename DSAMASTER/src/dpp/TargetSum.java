package dpp;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int n : nums) total += n;
        if (Math.abs(target) > total || (total + target) % 2 != 0) return 0;
        int subsetSum = (total + target) / 2;
        int[] dp = new int[subsetSum + 1];
        dp[0] = 1;
        for (int n : nums) {
            for (int t = subsetSum; t >= n; t--) {
                dp[t] += dp[t - n];
            }
        }
        return dp[subsetSum];
    }
}
