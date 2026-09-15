package array;

import java.util.Arrays;

public class ClosetSumToZero2 {
	public static int[] findclosetsumtozero(int[] arr) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int minvalue = Integer.MAX_VALUE;
		int[] result = new int[2];
		int sum = arr[left] + arr[right];
		if (Math.abs(sum) < Math.abs(minvalue)) {
			minvalue = sum;
			result[0] = arr[left];
			result[1] = arr[right];
		}
		if (sum < 0) {
			left++;
		} else {
			right--;

		}
		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, -100, 40, 50 };
		int[] closetsumtozero = findclosetsumtozero(arr);
		System.out.println(closetsumtozero[0] + "and" + closetsumtozero[1]);
	}
}
