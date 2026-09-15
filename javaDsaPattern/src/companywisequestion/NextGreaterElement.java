package companywisequestion;

import java.util.Stack;

//Question:
//Stock market application me
//Next Greater Element find karna hai.
public class NextGreaterElement {
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
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
