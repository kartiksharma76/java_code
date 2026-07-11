package graph;

import java.util.*;

public class PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        int[][] effort = new int[rows][cols];
        for (int[] row : effort) Arrays.fill(row, Integer.MAX_VALUE);
        effort[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]); // r, c, effort
        pq.add(new int[]{0, 0, 0});
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int r = cur[0], c = cur[1], e = cur[2];
            if (r == rows - 1 && c == cols - 1) return e;
            if (e > effort[r][c]) continue;
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nc >= 0 && nr < rows && nc < cols) {
                    int newEffort = Math.max(e, Math.abs(heights[nr][nc] - heights[r][c]));
                    if (newEffort < effort[nr][nc]) {
                        effort[nr][nc] = newEffort;
                        pq.add(new int[]{nr, nc, newEffort});
                    }
                }
            }
        }
        return 0;
    }
}
