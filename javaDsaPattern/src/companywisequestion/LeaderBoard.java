package companywisequestion;

import java.util.PriorityQueue;

public class LeaderBoard {
	public static void main(String[] args) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

		maxHeap.offer(500);
		maxHeap.offer(700);
		maxHeap.offer(300);
		maxHeap.offer(900);

		while (!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}

	}
}
