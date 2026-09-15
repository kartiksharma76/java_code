package dpp;

public class CountPartitionsGivenDiff {
    public int countPartitions(int[] nums, int diff) {
        int total = 0;
        for (int n : nums) total += n;
        if ((total + diff) % 2 != 0 || total < diff) return 0;
        int subsetSum = (total + diff) / 2;
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
