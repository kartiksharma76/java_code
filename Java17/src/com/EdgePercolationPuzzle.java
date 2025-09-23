package Google.com;

import java.util.*;

public class EdgePercolationPuzzle {

	static class Graph {
		private int V;
		private List<List<Integer>> adj;
		private int time;

		public Graph(int v) {
			V = v;
			adj = new ArrayList<>(V);
			for (int i = 0; i < V; i++) {
				adj.add(new ArrayList<>());
			}
			time = 0;
		}

		public void addEdge(int u, int v) {
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		public List<int[]> findBridges() {
			List<int[]> bridges = new ArrayList<>();
			boolean[] visited = new boolean[V];
			int[] disc = new int[V]; // discovery time
			int[] low = new int[V]; // lowest reachable ancestor
			int[] parent = new int[V];

			Arrays.fill(parent, -1);

			for (int i = 0; i < V; i++) {
				if (!visited[i]) {
					bridgeUtil(i, visited, disc, low, parent, bridges);
				}
			}

			return bridges;
		}

		private void bridgeUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent, List<int[]> bridges) {
			visited[u] = true;
			disc[u] = low[u] = ++time;

			for (int v : adj.get(u)) {
				if (!visited[v]) {
					parent[v] = u;
					bridgeUtil(v, visited, disc, low, parent, bridges);

					low[u] = Math.min(low[u], low[v]);

					if (low[v] > disc[u]) {
						bridges.add(new int[] { u, v });
					}
				} else if (v != parent[u]) {
					low[u] = Math.min(low[u], disc[v]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(3, 4);

		System.out.println("Critical Edges (Bridges) in the graph:");
		List<int[]> bridges = g.findBridges();

		if (bridges.isEmpty()) {
			System.out.println("No critical edges — graph remains connected even if any single edge is removed.");
		} else {
			for (int[] edge : bridges) {
				System.out.println(edge[0] + " — " + edge[1]);
			}
		}
	}
}
