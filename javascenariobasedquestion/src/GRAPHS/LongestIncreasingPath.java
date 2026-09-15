package GRAPHS;

public class LongestIncreasingPath {
	int[][] memo;
	int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public int longestIncreasingPath(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length, max = 0;
		memo = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				max = Math.max(max, dfs(matrix, i, j, m, n));
		return max;
	}

	private int dfs(int[][] mat, int i, int j, int m, int n) {
		if (memo[i][j] != 0)
			return memo[i][j];
		memo[i][j] = 1;
		for (int[] d : dirs) {
			int ni = i + d[0], nj = j + d[1];
			if (ni >= 0 && ni < m && nj >= 0 && nj < n && mat[ni][nj] > mat[i][j])
				memo[i][j] = Math.max(memo[i][j], 1 + dfs(mat, ni, nj, m, n));
		}
		return memo[i][j];
	}

	public static void main(String[] args) {
		LongestIncreasingPath sol = new LongestIncreasingPath();
		int[][] m = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };
		System.out.println(sol.longestIncreasingPath(m)); // 4
	}
}
