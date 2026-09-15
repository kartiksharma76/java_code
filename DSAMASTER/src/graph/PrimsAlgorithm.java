package graph;

import java.util.*;

public class PrimsAlgorithm {
    public int primMST(int V, List<List<int[]>> adj) {
        boolean[] visited = new boolean[V];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // weight, node
        pq.add(new int[]{0, 0});
        int sum = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int weight = cur[0], node = cur[1];
            if (visited[node]) continue;
            visited[node] = true;
            sum += weight;
            for (int[] edge : adj.get(node)) {
                int nbr = edge[0], w = edge[1];
                if (!visited[nbr]) pq.add(new int[]{w, nbr});
            }
        }
        return sum;
    }
}
