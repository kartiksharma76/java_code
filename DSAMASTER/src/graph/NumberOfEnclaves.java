package graph;

public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        for (int r = 0; r < rows; r++) {
            removeBoundary(grid, r, 0);
            removeBoundary(grid, r, cols - 1);
        }
        for (int c = 0; c < cols; c++) {
            removeBoundary(grid, 0, c);
            removeBoundary(grid, rows - 1, c);
        }
        int count = 0;
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (grid[r][c] == 1) count++;
        return count;
    }
    private void removeBoundary(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != 1) return;
        grid[r][c] = 0;
        removeBoundary(grid, r + 1, c); removeBoundary(grid, r - 1, c);
        removeBoundary(grid, r, c + 1); removeBoundary(grid, r, c - 1);
    }
}
