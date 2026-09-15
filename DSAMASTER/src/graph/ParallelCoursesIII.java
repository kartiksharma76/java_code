package graph;

import java.util.*;

public class ParallelCoursesIII {
    public int minimumTime(int n, int[][] relations, int[] time) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        int[] indegree = new int[n + 1];
        for (int[] r : relations) {
            adj.get(r[0]).add(r[1]);
            indegree[r[1]]++;
        }
        int[] finishTime = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) { q.add(i); finishTime[i] = time[i - 1]; }
        }
        int result = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            result = Math.max(result, finishTime[node]);
            for (int nbr : adj.get(node)) {
                finishTime[nbr] = Math.max(finishTime[nbr], finishTime[node] + time[nbr - 1]);
                if (--indegree[nbr] == 0) q.add(nbr);
            }
        }
        return result;
    }
}
