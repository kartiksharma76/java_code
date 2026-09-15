package graph;

import java.util.*;

public class SnakeAndLadderProblem {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] flat = new int[n * n + 1];
        int idx = 1;
        boolean leftToRight = true;
        for (int r = n - 1; r >= 0; r--) {
            if (leftToRight) {
                for (int c = 0; c < n; c++) flat[idx++] = board[r][c];
            } else {
                for (int c = n - 1; c >= 0; c--) flat[idx++] = board[r][c];
            }
            leftToRight = !leftToRight;
        }
        int[] dist = new int[n * n + 1];
        Arrays.fill(dist, -1);
        dist[1] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == n * n) return dist[cur];
            for (int next = cur + 1; next <= Math.min(cur + 6, n * n); next++) {
                int dest = flat[next] == -1 ? next : flat[next];
                if (dist[dest] == -1) {
                    dist[dest] = dist[cur] + 1;
                    q.add(dest);
                }
            }
        }
        return -1;
    }
}
