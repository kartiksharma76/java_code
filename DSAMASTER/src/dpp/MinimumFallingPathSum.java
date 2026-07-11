package dpp;

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[] dp = matrix[n - 1].clone();
        for (int r = n - 2; r >= 0; r--) {
            int[] next = new int[n];
            for (int c = 0; c < n; c++) {
                int best = dp[c];
                if (c > 0) best = Math.min(best, dp[c - 1]);
                if (c < n - 1) best = Math.min(best, dp[c + 1]);
                next[c] = matrix[r][c] + best;
            }
            dp = next;
        }
        int result = Integer.MAX_VALUE;
        for (int v : dp) result = Math.min(result, v);
        return result;
    }
}
