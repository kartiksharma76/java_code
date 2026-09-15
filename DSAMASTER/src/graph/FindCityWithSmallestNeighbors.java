package graph;

import java.util.*;

public class FindCityWithSmallestNeighbors {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for (int[] row : dist) Arrays.fill(row, (int) 1e9);
        for (int i = 0; i < n; i++) dist[i][i] = 0;
        for (int[] e : edges) {
            dist[e[0]][e[1]] = e[2];
            dist[e[1]][e[0]] = e[2];
        }
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j]) dist[i][j] = dist[i][k] + dist[k][j];

        int best = -1, minCount = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dist[i][j] <= distanceThreshold) count++;
            }
            if (count <= minCount) { minCount = count; best = i; }
        }
        return best;
    }
}
