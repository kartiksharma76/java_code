package litcode;

import java.util.LinkedList;
import java.util.Queue;

import Stack.Mystack;

class MyStack {
	Queue<Integer> q = new LinkedList<>();

	public void push(int x) {
		q.add(x);

		for (int i = 0; i < q.size() - 1; i++) {
			q.add(q.remove());
		}
	}

	public int pop() {
		return q.remove();
	}

	public int top() {
		return q.peek();
	}

	public boolean empty() {
		return q.isEmpty();
	}
}

public class ImplementStackusingQueues {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack.pop());
		System.out.println(stack.top());
	}
}
