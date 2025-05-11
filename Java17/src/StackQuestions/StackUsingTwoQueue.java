package StackQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	public void push(int x) {
		q2.offer(x);
		while (!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	public int pop() {
		if (q1.isEmpty()) {
			System.out.println("stack is underflow");
			return -1;
		}
		return q1.poll();
	}

	public int top() {
		if (q1.isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		return q1.peek();
	}

	public boolean isEmpty() {
		return q1.isEmpty();
	}

	public void print() {
		for (int val : q1) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackUsingTwoQueue stack = new StackUsingTwoQueue();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack:");
		stack.print();
		System.out.println("Popped: " + stack.pop()); // 30
		System.out.println("Top: " + stack.top()); // 20
		stack.print();
	}
}
