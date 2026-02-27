package infosyscodingquestion;

import java.util.*;

public class BFSExample {

	static void bfs(List<List<Integer>> graph, int start) {

		// Step 1: Create visited array
		boolean visited[] = new boolean[graph.size()];

		// Step 2: Create queue
		Queue<Integer> queue = new LinkedList<>();

		// Step 3: Mark start node as visited
		visited[start] = true;

		// Step 4: Add start node to queue
		queue.add(start);

		// Step 5: While queue not empty
		while (!queue.isEmpty()) {

			// Step 6: Remove front element
			int node = queue.poll();
			System.out.print(node + " ");

			// Step 7: Visit all adjacent nodes
			for (int neighbor : graph.get(node)) {

				// Step 8: If not visited
				if (!visited[neighbor]) {

					// Step 9: Mark visited
					visited[neighbor] = true;

					// Step 10: Add to queue
					queue.add(neighbor);
				}
			}
		}
	}

	public static void main(String[] args) {

		// Step 11: Create graph using adjacency list
		List<List<Integer>> graph = new ArrayList<>();

		for (int i = 0; i < 5; i++)
			graph.add(new ArrayList<>());

		// Step 12: Add edges
		graph.get(0).add(1);
		graph.get(0).add(2);
		graph.get(1).add(3);
		graph.get(2).add(4);

		// Step 13: Call BFS from node 0
		bfs(graph, 0);
	}
}