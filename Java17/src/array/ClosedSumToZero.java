package array;

import java.util.Arrays;

public class ClosedSumToZero {
	public static int[] findclosetsumofzero(int[] arr) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int minValune = Integer.MAX_VALUE;
		int result[] = new int[2];
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (Math.abs(sum) < Math.abs(minValune)) {
				minValune = sum;
				result[0] = arr[left];
				result[1] = arr[right];

			}
			if (sum < 0) {
				left++;

			} else {
				right--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, -100, 40, 50 };
		int[] clsedsumToZero = findclosetsumofzero(arr);
		System.out.println(clsedsumToZero[0] + " and" + clsedsumToZero[1]);
	}
}
