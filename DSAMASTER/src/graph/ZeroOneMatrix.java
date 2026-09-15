package graph;

import java.util.*;

// 01 Matrix - distance of nearest cell having 0 (equivalently nearest 1) via multi-source BFS
public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] dist = new int[rows][cols];
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> q = new LinkedList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (mat[r][c] == 0) { q.add(new int[]{r, c}); visited[r][c] = true; }
            }
        }
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dirs) {
                int nr = cur[0] + d[0], nc = cur[1] + d[1];
                if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    dist[nr][nc] = dist[cur[0]][cur[1]] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return dist;
    }
}
