package DsaQuestions.Hardestproblem;

public class BurstBalloons {
    public static int maxCoins(int[] nums) {
        int n = nums.length;
        int[] a = new int[n + 2];
        a[0] = 1;
        a[n + 1] = 1;
        System.arraycopy(nums, 0, a, 1, n);
        int[][] dp = new int[n + 2][n + 2];

        for (int len = 1; len <= n; len++) {
            for (int left = 1; left <= n - len + 1; left++) {
                int right = left + len - 1;

                for (int last = left; last <= right; last++) {
                    int coins = a[left - 1] * a[last] * a[right + 1] + dp[left][last - 1] + dp[last + 1][right];

                    dp[left][right] = Math.max(dp[left][right], coins);
                }
            }
        }
        return dp[1][n];
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 8};
        System.out.println(maxCoins(nums));
    }
}
