package array2026;

public class MinSubarray {
	public static void main(String[] args) {
		int[] arr = { 3, -4, 2, -3, -1, 7, -5 };
		int currentMin = arr[0];
		int minSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currentMin = Math.min(arr[i], currentMin + arr[i]);
			minSum = Math.min(minSum, currentMin);
		}

		System.out.println("Minimum Subarray Sum = " + minSum);
	}
}
