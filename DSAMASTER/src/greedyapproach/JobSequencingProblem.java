package greedyapproach;

import java.util.*;

public class JobSequencingProblem {
    public int[] jobSequencing(int[] deadlines, int[] profits) {
        int n = deadlines.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> profits[b] - profits[a]);

        int maxDeadline = 0;
        for (int d : deadlines) maxDeadline = Math.max(maxDeadline, d);
        boolean[] slot = new boolean[maxDeadline + 1];
        int countJobs = 0, totalProfit = 0;
        for (int i : idx) {
            for (int slotTime = Math.min(maxDeadline, deadlines[i]); slotTime > 0; slotTime--) {
                if (!slot[slotTime]) {
                    slot[slotTime] = true;
                    countJobs++;
                    totalProfit += profits[i];
                    break;
                }
            }
        }
        return new int[]{countJobs, totalProfit};
    }
}
