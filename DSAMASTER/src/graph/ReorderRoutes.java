package graph;

import java.util.*;

public class ReorderRoutes {
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> adj = new ArrayList<>(); // neighbor, direction(1=original)
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] c : connections) {
            adj.get(c[0]).add(new int[]{c[1], 1});
            adj.get(c[1]).add(new int[]{c[0], 0});
        }
        boolean[] visited = new boolean[n];
        return dfs(0, adj, visited);
    }
    private int dfs(int node, List<List<int[]>> adj, boolean[] visited) {
        visited[node] = true;
        int changes = 0;
        for (int[] edge : adj.get(node)) {
            if (!visited[edge[0]]) {
                changes += edge[1];
                changes += dfs(edge[0], adj, visited);
            }
        }
        return changes;
    }
}
