package StackQuestions;

import java.util.Arrays;
import java.util.Stack;

public class ImmediateSmallerElement {
	public static int[] findSmallerElement(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();
		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			result[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[i]);

		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 2, 3, 1, 7 };
		int[] res = findSmallerElement(arr);

		System.out.println("next smaller element:" + Arrays.toString(res));
	}
}
