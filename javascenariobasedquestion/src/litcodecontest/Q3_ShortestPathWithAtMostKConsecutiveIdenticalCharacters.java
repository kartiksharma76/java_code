package litcodecontest;

import java.util.*;

class Q3_ShortestPathWithAtMostKConsecutiveIdenticalCharacters {

	/*
	 * Problem Statement:
	 *
	 * You are given:
	 *
	 * 1. A directed weighted graph containing n nodes numbered from 0 to n - 1. 2.
	 * edges[i] = [from, to, weight] 3. A string labels where labels[i] represents
	 * the character assigned to node i. 4. An integer k.
	 *
	 * Find the minimum cost path from node 0 to node n - 1.
	 *
	 * Constraint: Along the chosen path, no character may appear more than k times
	 * consecutively.
	 *
	 * If no valid path exists, return -1.
	 *
	 * Example:
	 *
	 * n = 3 edges = {{0,1,1},{1,2,1},{0,2,3}} labels = "aab" k = 1
	 *
	 * Path 0 -> 1 -> 2 Labels = "aab" Consecutive 'a' count = 2 > 1 Invalid
	 *
	 * Path 0 -> 2 Labels = "ab" Cost = 3
	 *
	 * Output = 3
	 */

	// Edge class
	static class Edge {

		int to;
		int weight;

		Edge(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
	}

	// Dijkstra State
	static class State {

		long cost;
		int node;
		int consecutiveCount;

		State(long cost, int node, int consecutiveCount) {
			this.cost = cost;
			this.node = node;
			this.consecutiveCount = consecutiveCount;
		}
	}

	public static int shortestPath(int n, int[][] edges, String labels, int k) {

		List<Edge>[] graph = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}

		// Build Graph
		for (int[] edge : edges) {

			graph[edge[0]].add(new Edge(edge[1], edge[2]));
		}

		long[][] dist = new long[n][k + 1];

		for (int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Long.MAX_VALUE);
		}

		PriorityQueue<State> pq = new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));

		dist[0][1] = 0;

		pq.offer(new State(0, 0, 1));

		while (!pq.isEmpty()) {

			State current = pq.poll();

			if (current.cost != dist[current.node][current.consecutiveCount]) {
				continue;
			}

			if (current.node == n - 1) {
				return (int) current.cost;
			}

			for (Edge edge : graph[current.node]) {

				int nextNode = edge.to;

				int nextCount;

				if (labels.charAt(current.node) == labels.charAt(nextNode)) {

					nextCount = current.consecutiveCount + 1;

				} else {

					nextCount = 1;
				}

				if (nextCount > k) {
					continue;
				}

				long nextCost = current.cost + edge.weight;

				if (nextCost < dist[nextNode][nextCount]) {

					dist[nextNode][nextCount] = nextCost;

					pq.offer(new State(nextCost, nextNode, nextCount));
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int n = 3;

		int[][] edges = { { 0, 1, 1 }, { 1, 2, 1 }, { 0, 2, 3 } };

		String labels = "aab";

		int k = 1;

		int result = shortestPath(n, edges, labels, k);

		System.out.println("Shortest Valid Path Cost = " + result);
	}
}
