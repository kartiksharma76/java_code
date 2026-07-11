package graph;

import java.util.*;

// Topological Sort using Kahn's Algorithm (BFS)
public class TopologicalSort {
    public int[] topoSort(int V, List<List<Integer>> adj) {
        int[] indegree = new int[V];
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) indegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) if (indegree[i] == 0) q.add(i);

        int[] res = new int[V];
        int idx = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            res[idx++] = node;
            for (int nbr : adj.get(node)) {
                if (--indegree[nbr] == 0) q.add(nbr);
            }
        }
        return res;
    }
}
