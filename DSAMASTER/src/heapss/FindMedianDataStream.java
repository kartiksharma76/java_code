package heapss;

import java.util.*;

public class FindMedianDataStream {
    private final PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
    private final PriorityQueue<Integer> upperHalf = new PriorityQueue<>();

    public void addNum(int num) {
        lowerHalf.add(num);
        upperHalf.add(lowerHalf.poll());
        if (upperHalf.size() > lowerHalf.size()) {
            lowerHalf.add(upperHalf.poll());
        }
    }

    public double findMedian() {
        if (lowerHalf.size() > upperHalf.size()) return lowerHalf.peek();
        return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
    }
}
