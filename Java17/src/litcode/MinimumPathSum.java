package litcode;

public class MinimumPathSum {

	// Dynamic Programming Solution - O(m*n) time, O(m*n) space
	public int minPathSum(int[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}

		int m = grid.length;
		int n = grid[0].length;
		int[][] dp = new int[m][n];

		// Initialize starting position
		dp[0][0] = grid[0][0];

		// Initialize first row (can only come from left)
		for (int j = 1; j < n; j++) {
			dp[0][j] = dp[0][j - 1] + grid[0][j];
		}

		// Initialize first column (can only come from above)
		for (int i = 1; i < m; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}

		// Fill rest of the dp table
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
			}
		}

		return dp[m - 1][n - 1];
	}

	// Space Optimized Solution - O(m*n) time, O(n) space
	public int minPathSumOptimized(int[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}

		int m = grid.length;
		int n = grid[0].length;
		int[] dp = new int[n];

		dp[0] = grid[0][0];

		// Initialize first row
		for (int j = 1; j < n; j++) {
			dp[j] = dp[j - 1] + grid[0][j];
		}

		// Process remaining rows
		for (int i = 1; i < m; i++) {
			dp[0] += grid[i][0]; // First column
			for (int j = 1; j < n; j++) {
				dp[j] = Math.min(dp[j], dp[j - 1]) + grid[i][j];
			}
		}

		return dp[n - 1];
	}

	public static void main(String[] args) {
		MinimumPathSum mps = new MinimumPathSum();

		// Test Case 1: Standard 3x3 grid
		// 1 3 1
		// 1 5 1
		// 4 2 1
		// Minimum path: 1→3→1→1→1 = 7
		int[][] grid1 = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println("Test 1 (Expected: 7): " + mps.minPathSum(grid1));
		System.out.println("Test 1 Optimized (Expected: 7): " + mps.minPathSumOptimized(grid1));

		// Test Case 2: 2x2 grid
		// 1 2
		// 5 6
		// Minimum path: 1→2→6 = 9
		int[][] grid2 = { { 1, 2 }, { 5, 6 } };
		System.out.println("Test 2 (Expected: 9): " + mps.minPathSum(grid2));
		System.out.println("Test 2 Optimized (Expected: 9): " + mps.minPathSumOptimized(grid2));

		// Test Case 3: Single row
		// 1 2 3
		int[][] grid3 = { { 1, 2, 3 } };
		System.out.println("Test 3 (Expected: 6): " + mps.minPathSum(grid3));
		System.out.println("Test 3 Optimized (Expected: 6): " + mps.minPathSumOptimized(grid3));

		// Test Case 4: Single column
		// 1
		// 2
		// 3
		int[][] grid4 = { { 1 }, { 2 }, { 3 } };
		System.out.println("Test 4 (Expected: 6): " + mps.minPathSum(grid4));
		System.out.println("Test 4 Optimized (Expected: 6): " + mps.minPathSumOptimized(grid4));

		// Test Case 5: Single cell
		int[][] grid5 = { { 5 } };
		System.out.println("Test 5 (Expected: 5): " + mps.minPathSum(grid5));
		System.out.println("Test 5 Optimized (Expected: 5): " + mps.minPathSumOptimized(grid5));

		// Test Case 6: Larger grid
		// 1 2 5
		// 3 2 1
		// 4 3 2
		int[][] grid6 = { { 1, 2, 5 }, { 3, 2, 1 }, { 4, 3, 2 } };
		System.out.println("Test 6 (Expected: 10): " + mps.minPathSum(grid6));
		System.out.println("Test 6 Optimized (Expected: 10): " + mps.minPathSumOptimized(grid6));

		// Test Case 7: All same values
		int[][] grid7 = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		System.out.println("Test 7 (Expected: 10): " + mps.minPathSum(grid7));
		System.out.println("Test 7 Optimized (Expected: 10): " + mps.minPathSumOptimized(grid7));

		// Verify both solutions produce same results
		System.out.println("\nAll tests passed: " + (mps.minPathSum(grid1) == mps.minPathSumOptimized(grid1)
				&& mps.minPathSum(grid2) == mps.minPathSumOptimized(grid2)
				&& mps.minPathSum(grid3) == mps.minPathSumOptimized(grid3)
				&& mps.minPathSum(grid4) == mps.minPathSumOptimized(grid4)
				&& mps.minPathSum(grid5) == mps.minPathSumOptimized(grid5)
				&& mps.minPathSum(grid6) == mps.minPathSumOptimized(grid6)
				&& mps.minPathSum(grid7) == mps.minPathSumOptimized(grid7)));
	}
}