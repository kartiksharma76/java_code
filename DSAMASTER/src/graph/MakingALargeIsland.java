package graph;

import java.util.*;

public class MakingALargeIsland {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int id = 2;
        Map<Integer, Integer> sizeOf = new HashMap<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    int size = dfs(grid, r, c, id);
                    sizeOf.put(id, size);
                    id++;
                }
            }
        }
        int best = sizeOf.values().stream().max(Integer::compareTo).orElse(0);
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 0) {
                    Set<Integer> neighborIds = new HashSet<>();
                    for (int[] d : dirs) {
                        int nr = r + d[0], nc = c + d[1];
                        if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] > 1) {
                            neighborIds.add(grid[nr][nc]);
                        }
                    }
                    int sum = 1;
                    for (int nid : neighborIds) sum += sizeOf.get(nid);
                    best = Math.max(best, sum);
                }
            }
        }
        return best;
    }
    private int dfs(int[][] grid, int r, int c, int id) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid.length || grid[r][c] != 1) return 0;
        grid[r][c] = id;
        return 1 + dfs(grid, r+1, c, id) + dfs(grid, r-1, c, id) + dfs(grid, r, c+1, id) + dfs(grid, r, c-1, id);
    }
}
