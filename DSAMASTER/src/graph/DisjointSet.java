package graph;

// Disjoint Set Union / Union-Find with path compression and union by rank/size
public class DisjointSet {
    private final int[] parent, rank, size;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) { parent[i] = i; size[i] = 1; }
    }

    public int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    public void unionByRank(int u, int v) {
        int pu = find(u), pv = find(v);
        if (pu == pv) return;
        if (rank[pu] < rank[pv]) parent[pu] = pv;
        else if (rank[pu] > rank[pv]) parent[pv] = pu;
        else { parent[pv] = pu; rank[pu]++; }
    }

    public void unionBySize(int u, int v) {
        int pu = find(u), pv = find(v);
        if (pu == pv) return;
        if (size[pu] < size[pv]) { parent[pu] = pv; size[pv] += size[pu]; }
        else { parent[pv] = pu; size[pu] += size[pv]; }
    }

    public boolean connected(int u, int v) {
        return find(u) == find(v);
    }
}
