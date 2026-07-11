package backtrackings;

import java.util.*;

public class RatInAMaze {
    public List<String> findPath(int[][] maze) {
        int n = maze.length;
        List<String> res = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if (maze[0][0] == 1) backtrack(maze, 0, 0, visited, "", res);
        Collections.sort(res);
        return res;
    }
    private void backtrack(int[][] maze, int r, int c, boolean[][] visited, String path, List<String> res) {
        int n = maze.length;
        if (r == n - 1 && c == n - 1) { res.add(path); return; }
        visited[r][c] = true;
        int[][] dirs = {{1,0},{-1,0},{0,-1},{0,1}};
        char[] dirChar = {'D','U','L','R'};
        for (int k = 0; k < 4; k++) {
            int nr = r + dirs[k][0], nc = c + dirs[k][1];
            if (nr >= 0 && nc >= 0 && nr < n && nc < n && maze[nr][nc] == 1 && !visited[nr][nc]) {
                backtrack(maze, nr, nc, visited, path + dirChar[k], res);
            }
        }
        visited[r][c] = false;
    }
}
