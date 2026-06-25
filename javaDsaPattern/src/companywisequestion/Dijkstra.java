package companywisequestion;

//Question:
//Google Maps me shortest route find karna hai.

import java.util.*;

public class Dijkstra {

	static class Pair {

		int node;
		int distance;

		Pair(int node, int distance) {

			this.node = node;
			this.distance = distance;
		}
	}

	public static void main(String[] args) {

		int V = 5;

		List<List<Pair>> graph = new ArrayList<>();

		for (int i = 0; i < V; i++) {
			graph.add(new ArrayList<>());
		}

		graph.get(0).add(new Pair(1, 2));

		graph.get(0).add(new Pair(2, 4));

		graph.get(1).add(new Pair(3, 7));

		graph.get(2).add(new Pair(4, 3));

		int[] dist = new int[V];

		Arrays.fill(dist, Integer.MAX_VALUE);

		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);

		dist[0] = 0;

		pq.offer(new Pair(0, 0));

		while (!pq.isEmpty()) {

			Pair current = pq.poll();

			for (Pair nbr : graph.get(current.node)) {

				if (dist[current.node] + nbr.distance < dist[nbr.node]) {

					dist[nbr.node] = dist[current.node] + nbr.distance;

					pq.offer(new Pair(nbr.node, dist[nbr.node]));
				}
			}
		}

		System.out.println(Arrays.toString(dist));
	}
}
