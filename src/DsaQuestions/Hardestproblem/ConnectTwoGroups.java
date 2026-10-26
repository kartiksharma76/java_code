package DsaQuestions.Hardestproblem;

import java.util.Arrays;
import java.util.List;

public class ConnectTwoGroups {
    public static int connectedTwoGroup(List<List<Integer>> cost) {
        int m = cost.size();
        int n = cost.get(0).size();

        int totalMasks = 1 << n;
        int INF = 1_000_000_000;

        int[] dp = new int[totalMasks];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 0; i < m; i++) {
            int[] next = new int[totalMasks];
            Arrays.fill(next, INF);


            for (int mask = 0; mask < totalMasks; mask++) {
                if (dp[mask] == INF) continue;

                for (int j = 0; j < n; j++) {
                    int newMask = mask | (1 << j);
                    next[newMask] = Math.min(next[newMask], dp[mask] + cost.get(i).get(j));
                }
            }
            dp = next;

        }
        int[] minCost = new int[n];
        for (int j = 0; j < n; j++) {
            minCost[j] = Integer.MAX_VALUE;

            for (int i = 0; i < m; i++) {
                minCost[j] = Math.min(minCost[j], cost.get(i).get(j));
            }
        }
        int answer = INF;
        for (int mask = 0; mask < totalMasks; mask++) {
            int total = dp[mask];

            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) == 0) {
                    total += minCost[j];
                }
            }
            answer = Math.min(answer, total);
        }
        return answer;
    }

    public static void main(String[] args) {
        List<List<Integer>> cost = Arrays.asList(Arrays.asList(15, 96), Arrays.asList(36, 2));
        System.out.println(connectedTwoGroup(cost));
    }
}
