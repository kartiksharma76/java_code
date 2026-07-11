package graph;

import java.util.*;

public class MinMultiplicationsToReachEnd {
    public int minimumMultiplications(int[] arr, int start, int end) {
        final int MOD = 100000;
        int[] dist = new int[MOD];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == end) return dist[cur];
            for (int a : arr) {
                int next = (int) (((long) cur * a) % MOD);
                if (dist[cur] + 1 < dist[next]) {
                    dist[next] = dist[cur] + 1;
                    q.add(next);
                }
            }
        }
        return -1;
    }
}
