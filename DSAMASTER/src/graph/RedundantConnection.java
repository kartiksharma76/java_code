package graph;

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        for (int i = 0; i <= n; i++) parent[i] = i;
        for (int[] e : edges) {
            int u = find(parent, e[0]), v = find(parent, e[1]);
            if (u == v) return e;
            parent[u] = v;
        }
        return new int[0];
    }
    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }
}
