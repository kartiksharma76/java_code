package nqttop150;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> MinStack = new Stack<>();

	public void push(int data) {
		stack.push(data);
		if (MinStack.isEmpty() || data <= MinStack.peek()) {
			MinStack.push(data);

		}
	}

	public void pop() {
		if (stack.pop().equals(MinStack.peek())) {
			MinStack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return MinStack.peek();
	}

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(1);
		stack.push(2);
		stack.push(0);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack.getMin());
	}
}
