package graph;

import java.util.*;

// Escape the Spreading Fire - binary search on wait time + multi-source BFS for fire spread
public class EscapeSpreadingFire {
    private int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    public int maximumMinutes(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] fireTime = bfsFire(grid);
        int lo = 0, hi = rows * cols, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canReach(grid, fireTime, mid)) { ans = mid; lo = mid + 1; }
            else hi = mid - 1;
        }
        return ans >= rows * cols ? 1_000_000_000 : ans;
    }

    private int[][] bfsFire(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] fireTime = new int[rows][cols];
        for (int[] row : fireTime) Arrays.fill(row, -1);
        Queue<int[]> q = new LinkedList<>();
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (grid[r][c] == 1) { q.add(new int[]{r, c}); fireTime[r][c] = 0; }
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dirs) {
                int nr = cur[0] + d[0], nc = cur[1] + d[1];
                if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] != 2 && fireTime[nr][nc] == -1) {
                    fireTime[nr][nc] = fireTime[cur[0]][cur[1]] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return fireTime;
    }

    private boolean canReach(int[][] grid, int[][] fireTime, int wait) {
        int rows = grid.length, cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        int time = wait;
        if (fireTime[0][0] != -1 && fireTime[0][0] <= time) return false;
        while (!q.isEmpty()) {
            int size = q.size();
            time++;
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int[] d : dirs) {
                    int nr = cur[0] + d[0], nc = cur[1] + d[1];
                    if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || visited[nr][nc] || grid[nr][nc] == 2) continue;
                    boolean burnsHere = fireTime[nr][nc] != -1 && fireTime[nr][nc] <= time;
                    if (nr == rows - 1 && nc == cols - 1) {
                        if (fireTime[nr][nc] != -1 && fireTime[nr][nc] < time) continue;
                        return true;
                    }
                    if (burnsHere) continue;
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return false;
    }
}
