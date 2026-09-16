package DsaQuestions.Meta;

import java.util.*;

public class CloneGraph {

    static class Node {
        int val;
        List<Node> neighbors;
        Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }
    }

    static HashMap<Node, Node> map = new HashMap<>();
    public static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // Already cloned
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // Create clone
        Node clone = new Node(node.val);
        map.put(node, clone);
        // Clone neighbors
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(
                    cloneGraph(neighbor));
        }

        return clone;
    }

    public static void printGraph(Node node, Set<Node> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }

        visited.add(node);
        System.out.print(node.val + " -> ");
        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.val + " ");
        }

        System.out.println();
        for (Node neighbor : node.neighbors) {
            printGraph(neighbor, visited);
        }
    }

    public static void main(String[] args) {
        // Create graph
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        // Clone graph
        Node cloned = cloneGraph(node1);
        System.out.println("Cloned Graph:");
        printGraph(cloned, new HashSet<>());
    }
}