package dpp;

import java.util.*;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = triangle.get(n - 1).get(i);
        for (int row = n - 2; row >= 0; row--) {
            for (int c = 0; c <= row; c++) {
                dp[c] = triangle.get(row).get(c) + Math.min(dp[c], dp[c + 1]);
            }
        }
        return dp[0];
    }
}
