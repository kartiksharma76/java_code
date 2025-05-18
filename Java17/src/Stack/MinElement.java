package Stack;

import java.util.Stack;

public class MinElement {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minstack = new Stack<>();

	public void push(int data) {
		stack.push(data);
		if (minstack.isEmpty() || data <= minstack.peek()) {
			minstack.push(data);
		}
	}

	public void pop() {
		if (stack.pop().equals(minstack.peek())) {
			minstack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getmin() {
		return minstack.peek();

	}

	public static void main(String[] args) {
		MinElement s = new MinElement();
		s.push(3);
		s.push(5);
		System.out.println("Min: " + s.getmin()); // 3
		s.push(2);
		s.push(1);
		System.out.println("Min: " + s.getmin()); // 1
		s.pop();
		System.out.println("Min: " + s.getmin()); // 2
		s.pop();
		System.out.println("Top: " + s.top()); // 5
		System.out.println("Min: " + s.getmin()); // 3
	}
}