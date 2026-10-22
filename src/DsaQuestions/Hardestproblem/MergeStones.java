package DsaQuestions.Hardestproblem;

public class MergeStones {
    public static int mergeStones(int[] stones, int k) {
        int n = stones.length;

        if (k == 1) {
            return n == 1 ? 0 : -1;
        }
        if ((n - 1) % (k - 1) != 0) {
            return -1;
        }
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stones[i];
        }
        int[][] dp = new int[n][n];
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int mid = i; mid < j; mid += k - 1) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][mid] + dp[mid + 1][j]);
                }

                if ((len - 1) % (k - 1) == 0) {
                    dp[i][j] += prefix[j + 1] - prefix[i];
                }
            }
        }
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        int[] stones = {3, 2, 4, 1};
        System.out.println(mergeStones(stones, 2)); // 20
    }

}
