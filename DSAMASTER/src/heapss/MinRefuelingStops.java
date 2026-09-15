package heapss;

import java.util.*;

// Minimum Number of Refueling Stops
public class MinRefuelingStops {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int fuel = startFuel, stops = 0, i = 0;
        while (fuel < target) {
            while (i < stations.length && stations[i][0] <= fuel) {
                maxHeap.add(stations[i][1]);
                i++;
            }
            if (maxHeap.isEmpty()) return -1;
            fuel += maxHeap.poll();
            stops++;
        }
        return stops;
    }
}
