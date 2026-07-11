package graph;

import java.util.*;

// Critical Connections in a Network (same as bridges, LeetCode style adjacency list input)
public class CriticalConnections {
    private int timer = 0;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (List<Integer> c : connections) {
            adj.get(c.get(0)).add(c.get(1));
            adj.get(c.get(1)).add(c.get(0));
        }
        int[] disc = new int[n], low = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(disc, -1);
        List<List<Integer>> bridges = new ArrayList<>();
        timer = 0;
        for (int i = 0; i < n; i++) {
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
                if (low[nbr] > disc[node]) bridges.add(Arrays.asList(node, nbr));
            } else {
                low[node] = Math.min(low[node], disc[nbr]);
            }
        }
    }
}
