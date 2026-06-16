package StackAndQueue;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> in = new Stack<>(), out = new Stack<>();

	public void push(int x) {
		in.push(x);
	}

	public int pop() {
		peek();
		return out.pop();
	}

	public int peek() {
		if (out.isEmpty())
			while (!in.isEmpty())
				out.push(in.pop());
		return out.peek();
	}

	public boolean empty() {
		return in.isEmpty() && out.isEmpty();
	}

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		System.out.println(q.peek()); // 1
		System.out.println(q.pop()); // 1
		System.out.println(q.empty()); // false
	}
}
