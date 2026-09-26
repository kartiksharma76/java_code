package DsaQuestions.Flipkart;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleUndirectedGraph {
    public static boolean hasCycle(int vertices, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                if (dfs(neighbour, node, graph, visited)) {
                    return true;
                }
            } else if (neighbour != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int vertices = 4;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 0}};
        boolean result = hasCycle(vertices, edges);
        System.out.println("Cycle Present :" + result);
    }
}
