package litcode;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public static int largestRectangleArea(int[] heights) {

		Stack<Integer> stack = new Stack<>();
		int maxArea = 0;

		for (int i = 0; i <= heights.length; i++) {

			int currentHeight = (i == heights.length) ? 0 : heights[i];

			while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {

				int height = heights[stack.pop()];

				int width;

				if (stack.isEmpty()) {
					width = i;
				} else {
					width = i - stack.peek() - 1;
				}

				int area = height * width;

				maxArea = Math.max(maxArea, area);
			}

			stack.push(i);
		}

		return maxArea;
	}

	public static void main(String[] args) {

		int[] heights = { 2, 1, 5, 6, 2, 3 };

		System.out.println(largestRectangleArea(heights));
	}
}