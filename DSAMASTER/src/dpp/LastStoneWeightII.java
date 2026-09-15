package dpp;

public class LastStoneWeightII {
    public int lastStoneWeightII(int[] stones) {
        int total = 0;
        for (int s : stones) total += s;
        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int s : stones) {
            for (int t = target; t >= s; t--) {
                dp[t] = dp[t] || dp[t - s];
            }
        }
        int closest = 0;
        for (int t = target; t >= 0; t--) {
            if (dp[t]) { closest = t; break; }
        }
        return total - 2 * closest;
    }
}
