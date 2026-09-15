package heapss;

import java.util.*;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) maxHeap.add(s);
        while (maxHeap.size() > 1) {
            int a = maxHeap.poll(), b = maxHeap.poll();
            if (a != b) maxHeap.add(a - b);
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
