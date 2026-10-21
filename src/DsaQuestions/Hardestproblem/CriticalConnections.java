package DsaQuestions.Hardestproblem;


import java.util.*;

public class CriticalConnections {

    static List<List<Integer>> graph;
    static List<List<Integer>> bridges;
    static int[] discovery, low;
    static int timer;

    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

        graph = new ArrayList<>();
        bridges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> edge : connections) {
            int u = edge.get(0);
            int v = edge.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        discovery = new int[n];
        low = new int[n];
        timer = 0;

        for (int i = 0; i < n; i++) {
            if (discovery[i] == 0) {
                dfs(i, -1);
            }
        }

        return bridges;
    }

    static void dfs(int u, int parent) {
        discovery[u] = low[u] = ++timer;

        for (int v : graph.get(u)) {
            if (v == parent) {
                continue;
            }

            if (discovery[v] == 0) {
                dfs(v, u);

                low[u] = Math.min(low[u], low[v]);

                if (low[v] > discovery[u]) {
                    bridges.add(Arrays.asList(u, v));
                }
            } else {
                low[u] = Math.min(low[u], discovery[v]);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> edges = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2), Arrays.asList(2, 0), Arrays.asList(1, 3));
        System.out.println(criticalConnections(4, edges));
        // [[1, 3]]
    }
}
