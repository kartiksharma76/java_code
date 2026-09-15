package companywisequestion;

import java.util.ArrayList;
import java.util.List;

public class CycleDetection {
	static boolean dfs(int node, int parent, List<Integer>[] graph, boolean[] visited) {

		visited[node] = true;

		for (int nbr : graph[node]) {
			if (!visited[nbr]) {
				if (dfs(nbr, node, graph, visited))
					return true;
			} else if (nbr != parent) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int V = 4;
		List<Integer>[] graph = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(1);
		graph[1].add(0);

		graph[1].add(2);
		graph[2].add(1);

		graph[2].add(0);
		graph[0].add(2);

		boolean[] visited = new boolean[V];

		System.out.println(dfs(0, -1, graph, visited));
	}
}
