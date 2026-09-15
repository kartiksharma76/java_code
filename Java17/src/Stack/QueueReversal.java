package StackQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
	public static Queue<Integer> reverseQueue(Queue<Integer> q) {
		Stack<Integer> stack = new Stack<>();
		while (!q.isEmpty()) {
			stack.push(q.poll());
		}
		while (!stack.isEmpty()) {
			q.offer(stack.pop());
		}
		return q;

	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(6);
		queue.offer(3);
		queue.offer(1);
		queue.offer(10);
		queue.offer(2);
		queue.offer(6);

		System.out.println("original queue:" + queue);
		Queue<Integer> reversed = reverseQueue(queue);
		System.out.println("reversed queue:" + reversed);
	}
}
