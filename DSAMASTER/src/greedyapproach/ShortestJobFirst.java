package greedyapproach;

import java.util.*;

// Shortest Job First scheduling - returns average waiting time
public class ShortestJobFirst {
    public double shortestJobFirst(int[] burstTimes) {
        int[] sorted = burstTimes.clone();
        Arrays.sort(sorted);
        int waitTime = 0, totalWait = 0;
        for (int bt : sorted) {
            totalWait += waitTime;
            waitTime += bt;
        }
        return (double) totalWait / sorted.length;
    }
}
