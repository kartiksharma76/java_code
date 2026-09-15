package javaDsaPattern;

//Prim's Algorithm

import java.util.*;

public class PrimsAlgorithm {

	static class Pair {

		int vertex;
		int weight;

		Pair(int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
	}

	public static void prims(List<List<Pair>> graph, int V) {

		boolean[] visited = new boolean[V];

		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

		pq.offer(new Pair(0, 0));

		int cost = 0;

		while (!pq.isEmpty()) {

			Pair current = pq.poll();

			if (visited[current.vertex]) {
				continue;
			}

			visited[current.vertex] = true;

			cost += current.weight;

			for (Pair neighbor : graph.get(current.vertex)) {

				if (!visited[neighbor.vertex]) {
					pq.offer(new Pair(neighbor.vertex, neighbor.weight));
				}
			}
		}

		System.out.println("Minimum Cost = " + cost);
	}

	public static void main(String[] args) {

		int V = 4;

		List<List<Pair>> graph = new ArrayList<>();

		for (int i = 0; i < V; i++) {
			graph.add(new ArrayList<>());
		}

		graph.get(0).add(new Pair(1, 10));
		graph.get(0).add(new Pair(2, 15));

		graph.get(1).add(new Pair(0, 10));
		graph.get(1).add(new Pair(3, 40));

		graph.get(2).add(new Pair(0, 15));
		graph.get(2).add(new Pair(3, 50));

		graph.get(3).add(new Pair(1, 40));
		graph.get(3).add(new Pair(2, 50));

		prims(graph, V);
	}
}