package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	static void bfs(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[V];
		Queue<Integer> q = new LinkedList<>();

		visited[0] = true;
		q.add(0);

		while (!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node + " ");

			for (int it : adj.get(node)) {
				if (!visited[it]) {
					visited[it] = true;
					q.add(it);

				}

			}

		}
	}

	public static void main(String[] args) {
		int V = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<>());
		adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(1).add(3);
		adj.get(2).add(4);

		bfs(V, adj);
	}
}