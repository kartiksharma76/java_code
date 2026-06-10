package javascenariobasedquestion;

/**
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, O) and (i,
 * height[i]). Find two lines that together with the x-axis form a container,
 * such that the container contains the most water. Return the maximum amount of
 * water a container can store.
 */
public class WaterContainer {
	/**
	 * Start Initialize two pointers: left = 0 right = n - 1 Initialize maxWater =
	 * 0. While left < right: Calculate width = right - left Calculate height =
	 * min(height[left], height[right]) Calculate area = width × height Update
	 * maxWater if area is greater. Move the pointer having smaller height: If
	 * height[left] < height[right], increment left Else decrement right Return
	 * maxWater. Stop.
	 */

	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxWater = 0;

		while (left < right) {
			int width = right - left;
			int area = Math.min(height[left], height[right]) * width;

			maxWater = Math.max(maxWater, area);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxWater;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		System.out.println("Maximum Water = " + maxArea(height));
	}
}
