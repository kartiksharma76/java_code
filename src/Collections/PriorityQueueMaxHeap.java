package Collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}
