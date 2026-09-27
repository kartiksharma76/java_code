package DsaQuestions.uber;

public class BurstBalloons {
    public static int maxCoins(int[] nums) {
        int n = nums.length;
        int[] balloons = new int[n + 2];
        balloons[0] = 1;
        balloons[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            balloons[i + 1] = nums[i];
        }
        int[][] dp = new int[n + 2][n + 2];

        for (int length = 1; length <= n; length++) {

            for (int left = 1; left + length - 1 <= n; left++) {
                int right = left + length - 1;

                for (int last = left; last <= right; last++) {
                    int coins = balloons[left - 1] * balloons[last] * balloons[right + 1];

                    int leftCoins = dp[left][last - 1];
                    int rightCoins = dp[last + 1][right];

                    dp[left][right] = Math.max(dp[left][right], leftCoins + coins + rightCoins);

                }
            }
        }
        return dp[1][n];
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 8};

        int result = maxCoins(nums);
        System.out.println("Maximum Coins :" + result);
    }
}
