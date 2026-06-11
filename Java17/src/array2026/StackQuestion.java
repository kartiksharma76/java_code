package array2026;

import java.util.Stack;

public class StackQuestion {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Top: " + stack.peek());
		System.out.println("Removed: " + stack.pop());
		System.out.println(stack);
	}
}
