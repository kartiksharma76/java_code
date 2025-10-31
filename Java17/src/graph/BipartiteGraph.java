package graph;

import java.util.*;

public class BipartiteGraph {
    static boolean bfsCheck(int src, int[] color, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        color[src] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int it : adj.get(node)) {
                if (color[it] == -1) {
                    color[it] = 1 - color[node];
                    q.add(it);
                } else if (color[it] == color[node]) return false;
            }
        }
        return true;
    }

    static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1)
                if (!bfsCheck(i, color, adj)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        System.out.println(isBipartite(V, adj)); // true
    }
}

