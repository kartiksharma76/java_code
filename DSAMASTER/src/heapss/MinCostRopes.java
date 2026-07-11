package heapss;

import java.util.*;

// Minimum Cost of Ropes
public class MinCostRopes {
    public int minCost(int[] ropes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int r : ropes) minHeap.add(r);
        int totalCost = 0;
        while (minHeap.size() > 1) {
            int a = minHeap.poll(), b = minHeap.poll();
            int cost = a + b;
            totalCost += cost;
            minHeap.add(cost);
        }
        return totalCost;
    }
}
