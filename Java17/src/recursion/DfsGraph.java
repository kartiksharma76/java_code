package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DfsGraph {
	private Map<Integer, List<Integer>> adj = new HashMap<>();

	void addEdge(int v, int w) {
		adj.computeIfAbsent(v, k -> new ArrayList<>()).add(w);
	}

	void dfs(int v, Set<Integer> visited) {
		visited.add(v);
		System.out.print(v + " ");

		for (int neighbor : adj.getOrDefault(v, new ArrayList<>())) {
			if (!visited.contains(neighbor)) {
				dfs(neighbor, visited);
			}
		}
	}

	public static void main(String[] args) {
		DfsGraph g = new DfsGraph();

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		Set<Integer> visited = new HashSet<>();
		g.dfs(2, visited); 
	}
}
