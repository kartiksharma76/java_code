package nqttop150;

import java.util.Stack;

public class LargestRectangleArea {
	public static int largestRectangleArea(int[] height) {

		Stack<Integer> stack = new Stack<>();
		int maxArea = 0;
		int[] extendHeights = new int[height.length + 1];
		System.arraycopy(height, maxArea, extendHeights, maxArea, height.length);
		extendHeights[height.length] = 0;

		for (int i = 0; i < extendHeights.length; i++) {
			while (!stack.isEmpty() && extendHeights[i] < extendHeights[stack.peek()]) {
				int heights = extendHeights[stack.pop()];
				int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
				int area = heights * width;
				maxArea = Math.max(maxArea, area);
			}
			stack.push(i);
		}
		return maxArea;

	}

	public static void main(String[] args) {
		int[] heights = { 1, 3, 7 };
		int result = largestRectangleArea(heights);
		System.out.println("output:" + result);
	}
}
