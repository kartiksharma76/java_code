package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
	public int orangesRotting(int[][] grid) {
		int m = grid.length, n = grid[0].length, fresh = 0, minutes = 0;
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 2)
					q.add(new int[] { i, j });
				else if (grid[i][j] == 1)
					fresh++;
			}
		int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		while (!q.isEmpty() && fresh > 0) {
			minutes++;
			for (int sz = q.size(); sz > 0; sz--) {
				int[] cell = q.poll();
				for (int[] d : dirs) {
					int ni = cell[0] + d[0], nj = cell[1] + d[1];
					if (ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == 1) {
						grid[ni][nj] = 2;
						fresh--;
						q.add(new int[] { ni, nj });
					}
				}
			}
		}
		return fresh == 0 ? minutes : -1;
	}

	public static void main(String[] args) {
		RottingOranges sol = new RottingOranges();
		int[][] g = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		System.out.println(sol.orangesRotting(g)); // 4
	}
}
