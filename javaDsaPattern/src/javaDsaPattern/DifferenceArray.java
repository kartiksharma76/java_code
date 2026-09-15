package javaDsaPattern;

import java.util.Arrays;

public class DifferenceArray {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int l = 1;
		int r = 3;
		int val = 5;
		arr[l] += val;
		if (r + 1 < arr.length) {
			arr[r + 1] -= val;

		}

		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
		}
		System.out.println(Arrays.toString(arr));
	}
} 
