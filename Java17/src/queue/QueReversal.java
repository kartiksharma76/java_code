package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueReversal {

	public static void reverseQueue(Queue<Integer> q) {
		Stack<Integer> stack = new Stack<>();

		while (!q.isEmpty()) {
			stack.push(q.poll());
		}
		while (!stack.isEmpty()) {

		}
		q.offer(stack.pop());

	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(4);
		queue.offer(3);
		queue.offer(1);
		queue.offer(10);
		queue.offer(2);
		queue.offer(6);

		System.out.println(queue);
		reverseQueue(queue);
		System.out.println(queue);

	}
}

class Stack<T> {
	private Node<T> top;

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;

		}

	}

	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = top;
		top = newNode;

	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("stack is empty");
		}
		T data = top.data;
		top = top.next;
		return data;

	}

	public boolean isEmpty() {
		return top == null;

	}
}