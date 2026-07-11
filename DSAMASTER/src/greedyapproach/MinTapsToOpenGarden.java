package greedyapproach;

// Minimum Number of Taps to Open to Water a Garden
public class MinTapsToOpenGarden {
    public int minTaps(int n, int[] ranges) {
        int[] maxReach = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);
            maxReach[left] = Math.max(maxReach[left], right);
        }
        int taps = 0, curEnd = 0, farthest = 0;
        for (int i = 0; i <= n; i++) {
            if (i > farthest) return -1;
            if (i > curEnd) { taps++; curEnd = farthest; }
            farthest = Math.max(farthest, maxReach[i]);
        }
        return taps;
    }
}
