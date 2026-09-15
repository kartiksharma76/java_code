package dpp;

// Cherry Pickup II / Ninja and his Friends
public class CherryPickupII {
    public int cherryPickup(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Integer[][][] memo = new Integer[rows][cols][cols];
        return solve(grid, 0, 0, cols - 1, memo);
    }
    private int solve(int[][] grid, int row, int col1, int col2, Integer[][][] memo) {
        int rows = grid.length, cols = grid[0].length;
        if (col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) return Integer.MIN_VALUE;
        if (memo[row][col1][col2] != null) return memo[row][col1][col2];
        int value = grid[row][col1];
        if (col1 != col2) value += grid[row][col2];
        if (row == rows - 1) return memo[row][col1][col2] = value;

        int best = Integer.MIN_VALUE;
        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {
                best = Math.max(best, solve(grid, row + 1, col1 + d1, col2 + d2, memo));
            }
        }
        return memo[row][col1][col2] = value + best;
    }
}
