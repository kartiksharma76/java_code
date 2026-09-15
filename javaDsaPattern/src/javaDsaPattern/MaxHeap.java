package javaDsaPattern;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(10);
		pq.add(40);
		pq.add(20);
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
