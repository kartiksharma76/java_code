package graph;

import java.util.*;

// Tarjan's Algorithm - find all Bridges in a Graph
public class TarjanBridges {
    private int timer = 0;

    public List<List<Integer>> findBridges(int V, List<List<Integer>> adj) {
        int[] disc = new int[V], low = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(disc, -1);
        List<List<Integer>> bridges = new ArrayList<>();
        timer = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) dfs(i, -1, adj, visited, disc, low, bridges);
        }
        return bridges;
    }

    private void dfs(int node, int parent, List<List<Integer>> adj, boolean[] visited,
                      int[] disc, int[] low, List<List<Integer>> bridges) {
        visited[node] = true;
        disc[node] = low[node] = timer++;
        for (int nbr : adj.get(node)) {
            if (nbr == parent) continue;
            if (!visited[nbr]) {
                dfs(nbr, node, adj, visited, disc, low, bridges);
                low[node] = Math.min(low[node], low[nbr]);
                if (low[nbr] > disc[node]) {
                    bridges.add(Arrays.asList(node, nbr));
                }
            } else {
                low[node] = Math.min(low[node], disc[nbr]);
            }
        }
    }
}
