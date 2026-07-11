package graph;

import java.util.*;

public class ArticulationPoint {
    private int timer = 0;

    public List<Integer> articulationPoints(int V, List<List<Integer>> adj) {
        int[] disc = new int[V], low = new int[V];
        boolean[] visited = new boolean[V], isAP = new boolean[V];
        Arrays.fill(disc, -1);
        timer = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) dfs(i, -1, adj, visited, disc, low, isAP);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < V; i++) if (isAP[i]) res.add(i);
        return res;
    }

    private void dfs(int node, int parent, List<List<Integer>> adj, boolean[] visited,
                      int[] disc, int[] low, boolean[] isAP) {
        visited[node] = true;
        disc[node] = low[node] = timer++;
        int children = 0;
        for (int nbr : adj.get(node)) {
            if (nbr == parent) continue;
            if (!visited[nbr]) {
                children++;
                dfs(nbr, node, adj, visited, disc, low, isAP);
                low[node] = Math.min(low[node], low[nbr]);
                if (parent != -1 && low[nbr] >= disc[node]) isAP[node] = true;
            } else {
                low[node] = Math.min(low[node], disc[nbr]);
            }
        }
        if (parent == -1 && children > 1) isAP[node] = true;
    }
}
