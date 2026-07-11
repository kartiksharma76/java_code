package greedyapproach;

import java.util.*;

public class MinimizeHeightsII {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int result = sorted[n - 1] - sorted[0];
        int smallest = sorted[0] + k, largest = sorted[n - 1] - k;
        for (int i = 0; i < n - 1; i++) {
            if (sorted[i] - k < 0) continue;
            int minVal = Math.min(smallest, sorted[i + 1] - k);
            int maxVal = Math.max(largest, sorted[i] + k);
            result = Math.min(result, maxVal - minVal);
        }
        return result;
    }
}
