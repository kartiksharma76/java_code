package Stack;
import java.util.Stack;

public class MaxValue {
	public static int findMax(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return Integer.MIN_VALUE;
		}

		Stack<Integer> tempStack = new Stack<>();
		int max = Integer.MIN_VALUE;

		// Find max while preserving original stack
		while (!stack.isEmpty()) {
			int current = stack.pop();
			max = Math.max(max, current);
			tempStack.push(current);
		}

		// Restore original stack
		while (!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}

		return max;
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		int MaxValue = findMax(stack);
		System.out.println("Max value:" + MaxValue);

	}
}
