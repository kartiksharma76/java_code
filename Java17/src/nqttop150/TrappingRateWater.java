package nqttop150;

public class TrappingRateWater {
	public static int trap(int[] height) {

		int n = height.length;
		if (n == 0) {
			return 0;

		}
		int[] leftMax = new int[n];
		int[] rigthMax = new int[n];

		leftMax[0] = height[0];
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(height[i], leftMax[i - 1]);
		}
		rigthMax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rigthMax[i] = Math.max(height[i], rigthMax[i + 1]);

		}
		int trappedWater = 0;
		for (int i = 0; i < n; i++) {
			trappedWater += Math.min(leftMax[i], rigthMax[i]) - height[i];

		}
		return trappedWater;

	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 0, 3, 2, 5 };
		System.out.println(trap(arr));
	}
}
