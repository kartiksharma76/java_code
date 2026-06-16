package StackAndQueue;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack = new Stack<>(), minStack = new Stack<>();

	public void push(int val) {
		stack.push(val);
		if (minStack.isEmpty() || val <= minStack.peek())
			minStack.push(val);
	}

	public void pop() {
		if (stack.pop().equals(minStack.peek()))
			minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		MinStack ms = new MinStack();
		ms.push(-2);
		ms.push(0);
		ms.push(-3);
		System.out.println(ms.getMin()); // -3
		ms.pop();
		System.out.println(ms.getMin()); // -2
	}
}
