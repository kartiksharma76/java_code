package GRAPHS;

public class NumberOfProvinces {
	public int findCircleNum(int[][] isConnected) {
		int n = isConnected.length, count = 0;
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++)
			if (!visited[i]) {
				dfs(isConnected, visited, i);
				count++;
			}
		return count;
	}

	private void dfs(int[][] g, boolean[] vis, int i) {
		vis[i] = true;
		for (int j = 0; j < g.length; j++)
			if (g[i][j] == 1 && !vis[j])
				dfs(g, vis, j);
	}

	public static void main(String[] args) {
		NumberOfProvinces sol = new NumberOfProvinces();
		int[][] g = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		System.out.println(sol.findCircleNum(g)); // 2
	}
}