package Stack;

import java.util.Stack;

public class Minstack2 {
	public static int minStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return -1;

		}
		int min = stack.peek();
		for (int i : stack) {
			min = Math.min(min, i);

		}
		return min;
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(34);
		stack.push(335);
		stack.push(1814);
		stack.push(86);
		int min = minStack(stack);
		System.out.println("min elemnt:" + min);
	}
}
