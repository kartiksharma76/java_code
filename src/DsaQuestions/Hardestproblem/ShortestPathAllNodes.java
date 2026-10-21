package DsaQuestions.Hardestproblem;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathAllNodes {
    public static int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int target = (1 << n) - 1;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[1 << n][n];

        for (int i = 0; i < n; i++) {
            int mask = 1 << i;
            queue.offer(new int[]{i, mask, 0});
            visited[mask][i] = true;
        }
        while (!queue.isEmpty()) {
            int[] state = queue.poll();

            int node = state[0];
            int mask = state[1];
            int distance = state[2];

            if (mask == target) {
                return distance;
            }
            for (int next : graph[node]) {
                int newMask = mask | (1 << next);

                if (!visited[newMask][next]) {
                    visited[newMask][next] = true;
                    queue.offer(new int[]{next, newMask, distance + 1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] graph = {{1, 2, 3}, {0}, {0}, {0}};
        System.out.println(shortestPathLength(graph));
    }
}
