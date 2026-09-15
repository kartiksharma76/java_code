package graph;

import java.util.*;

public class BFSOfGraph {
    public List<Integer> bfs(int V, List<List<Integer>> adj) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);
            for (int nbr : adj.get(node)) {
                if (!visited[nbr]) {
                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
        }
        return res;
    }
}
