package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();

	public void push(int x) {
		q2.add(x);
		while (!q1.isEmpty())
			q2.add(q1.poll());
		Queue<Integer> tmp = q1;
		q1 = q2;
		q2 = tmp;
	}

	public int pop() {
		return q1.poll();
	}

	public int top() {
		return q1.peek();
	}

	public boolean empty() {
		return q1.isEmpty();
	}

	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		System.out.println(s.top()); // 2
		System.out.println(s.pop()); // 2
		System.out.println(s.empty()); // false
	}
}
