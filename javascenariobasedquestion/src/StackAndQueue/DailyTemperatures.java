package StackAndQueue;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] res = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int idx = stack.pop();
				res[idx] = i - idx;
			}
			stack.push(i);
		}
		return res;

	}

	public static void main(String[] args) {
		DailyTemperatures sol = new DailyTemperatures();
		int[] res = sol.dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
		for (int x : res)
			System.out.print(x + " "); // 1 1 4 2 1 1 0 0
	}
}
