package Collection2026;

import java.util.*;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();

		dq.addFirst(10); // stack
		dq.addLast(20); // queue

		System.out.println(dq);
	}
}
