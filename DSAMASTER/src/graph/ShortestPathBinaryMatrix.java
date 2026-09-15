package graph;

import java.util.*;

public class ShortestPathBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n-1][n-1] != 0) return -1;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == n - 1 && cur[1] == n - 1) return cur[2];
            for (int[] d : dirs) {
                int nr = cur[0] + d[0], nc = cur[1] + d[1];
                if (nr >= 0 && nc >= 0 && nr < n && nc < n && !visited[nr][nc] && grid[nr][nc] == 0) {
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc, cur[2] + 1});
                }
            }
        }
        return -1;
    }
}
