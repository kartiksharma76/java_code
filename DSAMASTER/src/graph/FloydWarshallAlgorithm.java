package graph;

public class FloydWarshallAlgorithm {
    public void floydWarshall(int[][] dist) {
        int n = dist.length;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (dist[i][k] == Integer.MAX_VALUE) continue;
                for (int j = 0; j < n; j++) {
                    if (dist[k][j] == Integer.MAX_VALUE) continue;
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
    }
}
