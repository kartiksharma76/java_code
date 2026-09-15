package nqttop150;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature2 {
	public static int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] result = new int[n];

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int previousDay = stack.pop();

				result[previousDay] = i - previousDay;

			}
			stack.push(i);
		}
		return result;

	}

	public static void main(String[] args) {
		int[] temperatures = { 30, 38, 30, 36, 35, 40, 28 };
		int[] result = dailyTemperatures(temperatures);
		System.out.println(Arrays.toString(result));
	}
}
