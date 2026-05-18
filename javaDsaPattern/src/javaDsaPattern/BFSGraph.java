package javaDsaPattern;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph {
	static void bfs(List<List<Integer>> graph, int start) {
		boolean[] visited = new boolean[graph.size()];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");
			for (int nei : graph.get(node)) {
				if (!visited[nei]) {
					visited[nei] = true;
					queue.offer(nei);
				}
			}
		}

	}
}
