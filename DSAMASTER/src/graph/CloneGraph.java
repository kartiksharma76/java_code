package graph;

import java.util.*;

public class CloneGraph {
    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node(int val) { this.val = val; neighbors = new ArrayList<>(); }
    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }
    private Node dfs(Node node, Map<Node, Node> map) {
        if (map.containsKey(node)) return map.get(node);
        Node clone = new Node(node.val);
        map.put(node, clone);
        for (Node nbr : node.neighbors) {
            clone.neighbors.add(dfs(nbr, map));
        }
        return clone;
    }
}
