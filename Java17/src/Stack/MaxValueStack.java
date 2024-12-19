package Stack;

import java.util.Stack;

public class MaxValueStack {
	public static int FindMax(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return Integer.MIN_VALUE;
		}
		int max = stack.peek();
		while (!stack.isEmpty()) {
			int current = stack.pop();
			max = Math.max(max, current);
		}
		return max;
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		int MaxValueStack = FindMax(stack);
		System.out.println("max value in stack:" + MaxValueStack);
	}
}