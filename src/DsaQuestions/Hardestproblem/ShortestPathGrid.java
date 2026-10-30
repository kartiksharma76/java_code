package DsaQuestions.Hardestproblem;


import java.util.*;

public class ShortestPathGrid {

    public static int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int remaining = k - grid[0][0];

        if (remaining < 0) return -1;

        int[][] best = new int[m][n];

        for (int[] row : best) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, remaining});
        best[0][0] = remaining;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] state = queue.poll();

                int r = state[0];
                int c = state[1];
                int rem = state[2];

                if (r == m - 1 && c == n - 1) {
                    return steps;
                }

                // A better state may already dominate this one.
                if (rem < best[r][c]) {
                    continue;
                }

                for (int[] d : directions) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                        continue;
                    }

                    int nextRem = rem - grid[nr][nc];

                    if (nextRem >= 0 && nextRem > best[nr][nc]) {

                        best[nr][nc] = nextRem;
                        queue.offer(new int[]{nr, nc, nextRem});
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {0, 0, 0}, {0, 1, 1}, {0, 0, 0}};

        System.out.println(shortestPath(grid, 1));
        // Output: 6
    }
}
