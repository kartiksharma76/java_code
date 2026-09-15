package graph;

import java.util.*;

public class DFSOfGraph {
    public List<Integer> dfs(int V, List<List<Integer>> adj) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsHelper(0, adj, visited, res);
        return res;
    }
    private void dfsHelper(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> res) {
        visited[node] = true;
        res.add(node);
        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) dfsHelper(nbr, adj, visited, res);
        }
    }
}
