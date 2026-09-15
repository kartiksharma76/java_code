package graph;

import java.util.*;

public class DetectCycleUndirected {
    static boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int it : adj.get(node)) {
            if (!visited[it]) {
                if (dfs(it, node, visited, adj)) return true;
            } else if (it != parent) return true;
        }
        return false;
    }

    static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i])
                if (dfs(i, -1, visited, adj)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(2);

        System.out.println(isCycle(V, adj)); // true
    }
}
