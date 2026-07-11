package graph;

import java.util.*;

public class CycleDetectionDirected {
    public boolean isCyclic(int V, List<List<Integer>> adj) {
        int[] state = new int[V]; // 0=unvisited, 1=in-progress, 2=done
        for (int i = 0; i < V; i++) {
            if (state[i] == 0 && dfs(i, adj, state)) return true;
        }
        return false;
    }
    private boolean dfs(int node, List<List<Integer>> adj, int[] state) {
        state[node] = 1;
        for (int nbr : adj.get(node)) {
            if (state[nbr] == 1) return true;
            if (state[nbr] == 0 && dfs(nbr, adj, state)) return true;
        }
        state[node] = 2;
        return false;
    }
}
