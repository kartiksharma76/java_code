package graph;

import java.util.*;

public class ShortestPathUndirectedUnitWeights {
    public int[] shortestPath(int n, int[][] edges, int src) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nbr : adj.get(node)) {
                if (dist[node] + 1 < dist[nbr]) {
                    dist[nbr] = dist[node] + 1;
                    q.add(nbr);
                }
            }
        }
        return dist;
    }
}
