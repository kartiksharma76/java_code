package graph;

import java.util.*;

public class NumberOfWaysToArrive {
    public int countPaths(int n, int[][] roads) {
        final int MOD = 1_000_000_007;
        List<List<long[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] r : roads) {
            adj.get(r[0]).add(new long[]{r[1], r[2]});
            adj.get(r[1]).add(new long[]{r[0], r[2]});
        }
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        long[] ways = new long[n];
        ways[0] = 1;
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
        pq.add(new long[]{0, 0});
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            int node = (int) cur[0];
            long d = cur[1];
            if (d > dist[node]) continue;
            for (long[] edge : adj.get(node)) {
                int nbr = (int) edge[0];
                long weight = edge[1];
                if (dist[node] + weight < dist[nbr]) {
                    dist[nbr] = dist[node] + weight;
                    ways[nbr] = ways[node];
                    pq.add(new long[]{nbr, dist[nbr]});
                } else if (dist[node] + weight == dist[nbr]) {
                    ways[nbr] = (ways[nbr] + ways[node]) % MOD;
                }
            }
        }
        return (int) (ways[n - 1] % MOD);
    }
}
