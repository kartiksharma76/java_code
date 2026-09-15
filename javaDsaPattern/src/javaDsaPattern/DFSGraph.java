package javaDsaPattern;

import java.util.List;

public class DFSGraph {
	static void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
		visited[node] = true;
		System.out.print(node + " ");
		for (int nei : graph.get(node)) {
			if (!visited[nei]) {
				dfs(graph, nei, visited);
			}
		}
	}
}
