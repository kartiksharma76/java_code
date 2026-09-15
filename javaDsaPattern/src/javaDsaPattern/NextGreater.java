package javaDsaPattern;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 25 };
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();

			}

			result[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[i]);

		}
		System.out.println(Arrays.toString(result));
	}
}