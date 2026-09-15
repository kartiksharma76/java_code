package graph;

import java.util.*;

// Minimum Spanning Tree - returns sum of edge weights in MST (Kruskal's)
public class MinimumSpanningTreeSum {
    public int spanningTree(int V, int[][] edges) {
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;
        int sum = 0, edgesUsed = 0;
        for (int[] e : edges) {
            int u = find(parent, e[0]), v = find(parent, e[1]);
            if (u != v) {
                parent[u] = v;
                sum += e[2];
                edgesUsed++;
                if (edgesUsed == V - 1) break;
            }
        }
        return sum;
    }
    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }
}
