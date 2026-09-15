package graph;

import java.util.*;

public class IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!bfsCheck(graph, color, i)) return false;
            }
        }
        return true;
    }
    private boolean bfsCheck(int[][] graph, int[] color, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nbr : graph[node]) {
                if (color[nbr] == -1) {
                    color[nbr] = 1 - color[node];
                    q.add(nbr);
                } else if (color[nbr] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}
