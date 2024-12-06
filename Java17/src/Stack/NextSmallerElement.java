package Stack;

import java.util.Stack;

public class NextSmallerElement {
	public static int[] nextSmallerElement(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = arr[stack.peek()];
			}

			stack.push(i);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 5, 3 };
		int[] result = nextSmallerElement(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
