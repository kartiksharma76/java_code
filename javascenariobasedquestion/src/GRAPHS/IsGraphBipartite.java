package GRAPHS;

public class IsGraphBipartite {
	public boolean isBipartite(int[][] graph) {
		int n = graph.length;
		int[] color = new int[n];
		java.util.Arrays.fill(color, -1);
		for (int i = 0; i < n; i++) {
			if (color[i] == -1) {
				java.util.Queue<Integer> q = new java.util.LinkedList<>();
				q.add(i);
				color[i] = 0;
				while (!q.isEmpty()) {
					int node = q.poll();
					for (int nb : graph[node]) {
						if (color[nb] == -1) {
							color[nb] = 1 - color[node];
							q.add(nb);
						} else if (color[nb] == color[node])
							return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsGraphBipartite sol = new IsGraphBipartite();
		int[][] g = { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };
		System.out.println(sol.isBipartite(g)); // true
	}
}
