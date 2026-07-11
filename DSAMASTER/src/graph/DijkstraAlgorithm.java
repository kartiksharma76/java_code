package graph;

import java.util.*;

public class DijkstraAlgorithm {
    public int[] dijkstra(int n, List<List<int[]>> adj, int src) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); // node, dist
        pq.add(new int[]{src, 0});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0], d = cur[1];
            if (d > dist[node]) continue;
            for (int[] edge : adj.get(node)) {
                int nbr = edge[0], weight = edge[1];
                if (dist[node] + weight < dist[nbr]) {
                    dist[nbr] = dist[node] + weight;
                    pq.add(new int[]{nbr, dist[nbr]});
                }
            }
        }
        return dist;
    }
}
