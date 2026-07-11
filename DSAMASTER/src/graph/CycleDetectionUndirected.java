package graph;

import java.util.*;

public class CycleDetectionUndirected {
    public boolean isCyclic(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfsCheck(i, adj, visited)) return true;
            }
        }
        return false;
    }
    private boolean bfsCheck(int start, List<List<Integer>> adj, boolean[] visited) {
        Queue<int[]> q = new LinkedList<>(); // node, parent
        q.add(new int[]{start, -1});
        visited[start] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0], parent = cur[1];
            for (int nbr : adj.get(node)) {
                if (!visited[nbr]) {
                    visited[nbr] = true;
                    q.add(new int[]{nbr, node});
                } else if (nbr != parent) {
                    return true;
                }
            }
        }
        return false;
    }
}
