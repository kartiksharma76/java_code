package javaDsaPattern;

import java.util.Stack;

public class CStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// Push
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Stack: " + stack);

		// Peek
		System.out.println("Top Element :" + stack.peek());

		System.out.println("Popped Element: " + stack.pop());

		System.out.println("Stack after pop: " + stack);

		// Search
		System.out.println("Position of 10: " + stack.search(10));

		// Size
		System.out.println("Size: " + stack.size());

		// Check Empty
		System.out.println("Is Empty: " + stack.isEmpty());

		// Contains
		System.out.println("Contains 20: " + stack.contains(20));

		// Iterate
		System.out.print("Elements: ");
		for (int num : stack) {
			System.out.print(num + " ");
		}

		System.out.println();

		// Clear
		stack.clear();

		System.out.println("After Clear: " + stack);
		System.out.println("Is Empty: " + stack.isEmpty());
	}
}
