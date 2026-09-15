package dpp;

public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int rows = dungeon.length, cols = dungeon[0].length;
        int[][] dp = new int[rows + 1][cols + 1];
        for (int[] row : dp) java.util.Arrays.fill(row, Integer.MAX_VALUE);
        dp[rows][cols - 1] = 1;
        dp[rows - 1][cols] = 1;
        for (int r = rows - 1; r >= 0; r--) {
            for (int c = cols - 1; c >= 0; c--) {
                int need = Math.min(dp[r + 1][c], dp[r][c + 1]) - dungeon[r][c];
                dp[r][c] = need <= 0 ? 1 : need;
            }
        }
        return dp[0][0];
    }
}
