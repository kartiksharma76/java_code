package prefisxsum;

// Maximum Sum of a 2D Subgrid of size K x K
public class MaxSum2DSubgrid {
    public int maxSideLength(int[][] grid, int k) {
        int rows = grid.length, cols = grid[0].length;
        int[][] prefix = new int[rows + 1][cols + 1];
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                prefix[r + 1][c + 1] = grid[r][c] + prefix[r][c + 1] + prefix[r + 1][c] - prefix[r][c];

        int maxSum = Integer.MIN_VALUE;
        for (int r = 0; r + k <= rows; r++) {
            for (int c = 0; c + k <= cols; c++) {
                int sum = prefix[r + k][c + k] - prefix[r][c + k] - prefix[r + k][c] + prefix[r][c];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
