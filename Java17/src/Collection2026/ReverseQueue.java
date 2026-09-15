package Collection2026;

import java.util.*;

public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3));
		Stack<Integer> stack = new Stack<>();
		while (!q.isEmpty()) {
			stack.push(q.poll());
		}

		while (!stack.isEmpty()) {
			q.add(stack.pop());
		}
		System.out.println(q);
	}
}
