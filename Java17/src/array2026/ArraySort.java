package array2026;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[][] arr = { { 10, 30, 20, 50 }, { 40, 70, 60 } };
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("sort :" + arr[i][j]);
			}

		}
	}
}
