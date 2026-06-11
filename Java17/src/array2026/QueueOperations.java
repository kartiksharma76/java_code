package array2026;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);

		System.out.println(q.poll());

		System.out.println(q);
	}
}
