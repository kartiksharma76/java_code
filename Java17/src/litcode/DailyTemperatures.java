package litcode;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temp) {
		int n = temp.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
				int index = stack.pop();
				result[index] = i - index;

			}
			stack.push(i);
		}
		return result;
	}

	public static void main(String[] args) {
		DailyTemperatures solution = new DailyTemperatures();

		// Test Case 1
		int[] temperatures1 = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] result1 = solution.dailyTemperatures(temperatures1);

		System.out.print("Input: [73, 74, 75, 71, 69, 72, 76, 73]\nOutput: [");
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i]);
			if (i < result1.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

		// Test Case 2
		int[] temperatures2 = { 30, 40, 50, 60 };
		int[] result2 = solution.dailyTemperatures(temperatures2);

		System.out.print("\nInput: [30, 40, 50, 60]\nOutput: [");
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i]);
			if (i < result2.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

		// Test Case 3
		int[] temperatures3 = { 30, 60, 90 };
		int[] result3 = solution.dailyTemperatures(temperatures3);

		System.out.print("\nInput: [30, 60, 90]\nOutput: [");
		for (int i = 0; i < result3.length; i++) {
			System.out.print(result3[i]);
			if (i < result3.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}