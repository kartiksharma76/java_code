package dpp;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int c = 1; c < n; c++) dp[c] = (obstacleGrid[0][c] == 1) ? 0 : dp[c - 1];
        for (int r = 1; r < m; r++) {
            dp[0] = obstacleGrid[r][0] == 1 ? 0 : dp[0];
            for (int c = 1; c < n; c++) {
                dp[c] = obstacleGrid[r][c] == 1 ? 0 : dp[c] + dp[c - 1];
            }
        }
        return dp[n - 1];
    }
}
