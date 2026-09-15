package javaDsaPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Edge {
	int src;
	int dest;
	int weight;

	Edge(int src, int dest, int weight) {
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}
}

public class KruskalAlgorithm {
	static int[] parent;

	public static int find(int x) {
		if (parent[x] == x) {
			return x;
		}
		return parent[x] = find(parent[x]);
	}

	public static void union(int x, int y) {
		int px = find(x);
		int py = find(y);

		if (px != py) {
			parent[px] = py;
		}
	}

	public static void main(String[] args) {
		int V = 4;
		List<Edge> edges = new ArrayList<>();

		edges.add(new Edge(0, 1, 10));
		edges.add(new Edge(0, 2, 6));
		edges.add(new Edge(0, 3, 5));
		edges.add(new Edge(1, 3, 15));
		edges.add(new Edge(2, 3, 4));

		Collections.sort(edges, (a, b) -> a.weight - b.weight);
		parent = new int[V];

		for (int i = 0; i < V; i++) {
			parent[i] = i;
		}
		int cost = 0;

		for (Edge e : edges) {
			if (find(e.src) != find(e.dest)) {
				union(e.src, e.dest);
				cost += e.weight;
				System.out.println(e.src + " - " + e.dest + " : " + e.weight);

			}
		}
		System.out.println("Minimum Cost = " + cost);
	}
}
