package graph;

import java.util.*;

public class ShortestPathDAG {
    public int[] shortestPath(int n, int[][] edges, int src) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        int[] indegree = new int[n];
        for (int[] e : edges) {
            adj.get(e[0]).add(new int[]{e[1], e[2]});
            indegree[e[1]]++;
        }
        // topo sort
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) if (indegree[i] == 0) q.add(i);
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);
            for (int[] nbr : adj.get(node)) {
                if (--indegree[nbr[0]] == 0) q.add(nbr[0]);
            }
        }
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int node : topo) {
            if (dist[node] != Integer.MAX_VALUE) {
                for (int[] nbr : adj.get(node)) {
                    if (dist[node] + nbr[1] < dist[nbr[0]]) dist[nbr[0]] = dist[node] + nbr[1];
                }
            }
        }
        return dist;
    }
}
