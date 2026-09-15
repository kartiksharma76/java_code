package javaDsaPattern;

//Implement Stack Using Queue

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q = new LinkedList<>();

	public void push(int x) {

		q.offer(x);

		for (int i = 0; i < q.size() - 1; i++) {
			q.offer(q.poll());
		}
	}

	public int pop() {
		return q.poll();
	}

	public int top() {
		return q.peek();
	}

	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Top = " + stack.top());

		System.out.println("Pop = " + stack.pop());

		System.out.println("Top After Pop = " + stack.top());
	}
}