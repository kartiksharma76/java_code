package Stack;

import java.util.Stack;

public class DeleteMiddleIndex {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		// calculate middle Index
		int middleIndex = stack.size() /2;

		// remove middle Index
	deleteMiddleIndex(stack, middleIndex);

		System.out.println(stack);
	}

	public static void deleteMiddleIndex(Stack<Integer> stack, int middleIndex) {

		Stack<Integer> tempStack = new Stack<>();

		for (int i = 1; i < middleIndex-1; i++) {
			tempStack.push(stack.pop());
			stack.pop();

		}

		while (!tempStack.isEmpty()) {
			stack.push(tempStack.pop());

		}

	}
}
