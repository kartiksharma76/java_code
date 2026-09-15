package Stack;

import java.util.Stack;

public class DleletePosition {
	public static void deleteAtPosition(Stack<Integer> stack, int position) {
		if (position < 0 || position >= stack.size()) {
			// throw new IndexOutOfBoundsException("Invalid position");
		}

		Stack<Integer> tempStack = new Stack<>();

		for (int i = 0; i < position; i++) {
			tempStack.push(stack.pop());
		}

		// Pop and discard the element at the desired position
		stack.pop();

		// Push remaining elements from the temporary stack back to the original stack
		while (!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("Original stack: " + stack);

		int positionToDelete = 3;
		deleteAtPosition(stack, positionToDelete);

		System.out.println("Stack after deletion: " + stack);
	}
}
