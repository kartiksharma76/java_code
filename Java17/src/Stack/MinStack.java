package Stack;

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
}
