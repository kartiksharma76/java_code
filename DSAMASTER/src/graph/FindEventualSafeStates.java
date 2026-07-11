package graph;

import java.util.*;

public class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n]; // 0 unvisited, 1 visiting, 2 safe
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, state)) res.add(i);
        }
        return res;
    }
    private boolean dfs(int node, int[][] graph, int[] state) {
        if (state[node] != 0) return state[node] == 2;
        state[node] = 1;
        for (int nbr : graph[node]) {
            if (!dfs(nbr, graph, state)) return false;
        }
        state[node] = 2;
        return true;
    }
}
