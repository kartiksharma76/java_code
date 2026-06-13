package matricAndarray;

import java.util.*;

public class ZeroOneMatrix {
	public int[][] updateMatrix(int[][] mat) {
		int m = mat.length, n = mat[0].length;
		int[][] dist = new int[m][n];
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 0)
					q.add(new int[] { i, j });
				else
					dist[i][j] = Integer.MAX_VALUE;
			}
		int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		while (!q.isEmpty()) {
			int[] cell = q.poll();
			for (int[] d : dirs) {
				int ni = cell[0] + d[0], nj = cell[1] + d[1];
				if (ni >= 0 && ni < m && nj >= 0 && nj < n && dist[ni][nj] > dist[cell[0]][cell[1]] + 1) {
					dist[ni][nj] = dist[cell[0]][cell[1]] + 1;
					q.add(new int[] { ni, nj });
				}
			}
		}
		return dist;
	}

	public static void main(String[] args) {
		ZeroOneMatrix sol = new ZeroOneMatrix();
		int[][] m = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int[][] res = sol.updateMatrix(m);
		for (int[] row : res) {
			for (int v : row)
				System.out.print(v + " ");
			System.out.println();
		}
	}
}