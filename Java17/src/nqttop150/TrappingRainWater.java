package nqttop150;

public class TrappingRainWater {
	public static int trap(int[] height) {
		int n = height.length;
		if (n == 0) {
			return 0;
		}
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];

		leftMax[0] = height[0];
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(height[i], leftMax[i - 1]);
		}
		rightMax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(height[i], rightMax[i + 1]);
		}
		int trappedWater = 0;
		for (int i = 0; i < n; i++) {
			trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];

		}
		return trappedWater;

	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(arr));
	}
}
