package graph;

import java.util.*;

public class MinCostConnectPointsKruskal {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<int[]> edges = new ArrayList<>(); // u, v, dist
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                edges.add(new int[]{i, j, dist});
            }
        }
        edges.sort((a, b) -> a[2] - b[2]);
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        int totalCost = 0, edgesUsed = 0;
        for (int[] e : edges) {
            int u = find(parent, e[0]), v = find(parent, e[1]);
            if (u != v) {
                parent[u] = v;
                totalCost += e[2];
                edgesUsed++;
                if (edgesUsed == n - 1) break;
            }
        }
        return totalCost;
    }
    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }
}
