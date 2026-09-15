package graph;

import java.util.*;

public class NumberOfIslandsII {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        int[] parent = new int[m * n];
        Arrays.fill(parent, -1);
        List<Integer> res = new ArrayList<>();
        int count = 0;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for (int[] pos : positions) {
            int r = pos[0], c = pos[1];
            int id = r * n + c;
            if (parent[id] != -1) { res.add(count); continue; } // already land
            parent[id] = id;
            count++;
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nc >= 0 && nr < m && nc < n) {
                    int nid = nr * n + nc;
                    if (parent[nid] != -1) {
                        int p1 = find(parent, id), p2 = find(parent, nid);
                        if (p1 != p2) { parent[p1] = p2; count--; }
                    }
                }
            }
            res.add(count);
        }
        return res;
    }
    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }
}
