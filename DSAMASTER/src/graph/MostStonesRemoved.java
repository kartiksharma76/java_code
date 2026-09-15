package graph;

import java.util.*;

public class MostStonesRemoved {
    public int removeStones(int[][] stones) {
        Map<Integer, Integer> parent = new HashMap<>();
        for (int[] s : stones) {
            int row = s[0], col = ~s[1]; // distinguish row/col namespace
            parent.putIfAbsent(row, row);
            parent.putIfAbsent(col, col);
            union(parent, row, col);
        }
        Set<Integer> roots = new HashSet<>();
        for (int[] s : stones) roots.add(find(parent, s[0]));
        return stones.length - roots.size();
    }
    private int find(Map<Integer, Integer> parent, int x) {
        if (parent.get(x) != x) parent.put(x, find(parent, parent.get(x)));
        return parent.get(x);
    }
    private void union(Map<Integer, Integer> parent, int a, int b) {
        int pa = find(parent, a), pb = find(parent, b);
        if (pa != pb) parent.put(pa, pb);
    }
}
