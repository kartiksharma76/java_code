package Collection2026;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();

		dq.add(10);
		dq.addFirst(5);
		dq.addLast(20);

		System.out.println(dq);

	}

}
