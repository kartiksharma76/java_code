package graph;

import java.util.*;

// Kosaraju's Algorithm - find number of Strongly Connected Components
public class KosarajuAlgorithm {
    public int kosaraju(int V, List<List<Integer>> adj) {
        Stack<Integer> finishOrder = new Stack<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) fillOrder(i, adj, visited, finishOrder);
        }

        List<List<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < V; i++) transpose.add(new ArrayList<>());
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) transpose.get(v).add(u);
        }

        Arrays.fill(visited, false);
        int sccCount = 0;
        while (!finishOrder.isEmpty()) {
            int node = finishOrder.pop();
            if (!visited[node]) {
                dfsTranspose(node, transpose, visited);
                sccCount++;
            }
        }
        return sccCount;
    }
    private void fillOrder(int node, List<List<Integer>> adj, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;
        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) fillOrder(nbr, adj, visited, stack);
        }
        stack.push(node);
    }
    private void dfsTranspose(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) dfsTranspose(nbr, adj, visited);
        }
    }
}
