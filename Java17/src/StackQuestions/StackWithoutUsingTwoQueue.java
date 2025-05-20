package StackQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithoutUsingTwoQueue {
	Queue<Integer> q = new LinkedList<>();

	public void push(int data) {
		q.offer(data);
		int size = q.size();
		for (int i = 0; i < size - 1; i++) {
			q.offer(q.poll());
		}
	}

	public int pop() {
		if (q.isEmpty()) {
			System.out.println("stack is under flow");
			return -1;
		}
		return q.poll();
	}

	public int top() {
		if (q.isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		return q.peek();
	}

	public boolean isEmpty() {
		return q.isEmpty();
	}

	public void print() {
		System.out.println(q);
	}

	public static void main(String[] args) {
		StackWithoutUsingTwoQueue stack = new StackWithoutUsingTwoQueue();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Stack:");
		stack.print(); 

		System.out.println("Popped: " + stack.pop()); 
		System.out.println("Top: " + stack.top()); 
		stack.print(); 
	}
}
