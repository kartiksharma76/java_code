package dpp;

import java.util.*;

public class MinimumCostToCutStick {
    public int minCost(int n, int[] cuts) {
        List<Integer> points = new ArrayList<>();
        points.add(0);
        for (int c : cuts) points.add(c);
        points.add(n);
        Collections.sort(points);
        int m = points.size();
        int[][] dp = new int[m][m];
        for (int len = 2; len < m; len++) {
            for (int i = 0; i + len < m; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    int cost = dp[i][k] + dp[k][j] + (points.get(j) - points.get(i));
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[0][m - 1];
    }
}
