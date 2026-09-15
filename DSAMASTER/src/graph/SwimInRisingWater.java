package graph;

import java.util.*;

public class SwimInRisingWater {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // [time, r, c]
        boolean[][] visited = new boolean[n][n];
        pq.add(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int ans = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            ans = Math.max(ans, cur[0]);
            if (cur[1] == n - 1 && cur[2] == n - 1) return ans;
            for (int[] d : dirs) {
                int nr = cur[1] + d[0], nc = cur[2] + d[1];
                if (nr >= 0 && nc >= 0 && nr < n && nc < n && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    pq.add(new int[]{grid[nr][nc], nr, nc});
                }
            }
        }
        return ans;
    }
}
