package litcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Nodes {
	public int value;
	public List<Nodes> neighbours;

	public Nodes() {
		value = 0;
		neighbours = new ArrayList<>();
	}

	public Nodes(int values) {
		this.value = values;
		neighbours = new ArrayList<>();
	}
}

public class CloneGraph {
	private Map<Nodes, Nodes> map = new HashMap<>();

	public Nodes cloneGraph(Nodes node) {
		if (node == null)
			return null;

		if (map.containsKey(node))
			return map.get(node);

		Nodes copy = new Nodes(node.value);
		map.put(node, copy);

		for (Nodes neighbour : node.neighbours) {
			copy.neighbours.add(cloneGraph(neighbour));
		}
		return copy;
	}

	// Helper to visualize the graph and verify it's a deep copy
	public static void printGraph(Nodes node, Set<Nodes> visited) {
		if (node == null || visited.contains(node))
			return;
		visited.add(node);

		System.out.print("Node " + node.value + " neighbors: ");
		for (Nodes n : node.neighbours) {
			System.out.print(n.value + " ");
		}
		System.out.println("(Object ID: " + System.identityHashCode(node) + ")");

		for (Nodes n : node.neighbours) {
			printGraph(n, visited);
		}
	}

	public static void main(String[] args) {
		// Create a simple undirected graph: 1 <-> 2, 2 <-> 3, 3 <-> 1
		Nodes n1 = new Nodes(1);
		Nodes n2 = new Nodes(2);
		Nodes n3 = new Nodes(3);

		n1.neighbours.addAll(Arrays.asList(n2, n3));
		n2.neighbours.addAll(Arrays.asList(n1, n3));
		n3.neighbours.addAll(Arrays.asList(n1, n2));

		CloneGraph cloner = new CloneGraph();
		Nodes clonedRoot = cloner.cloneGraph(n1);

		System.out.println("--- Original Graph ---");
		printGraph(n1, new HashSet<>());

		System.out.println("\n--- Cloned Graph ---");
		printGraph(clonedRoot, new HashSet<>());

		// Verification check
		System.out.println(
				"\nVerification: " + (n1 != clonedRoot ? "SUCCESS (Different Objects)" : "FAIL (Same Object)"));
	}
}