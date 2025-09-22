package Google.com;

import java.util.Arrays;

public class RemoveDuplicate {
	public static int[] removeDuplicate(int[] arr) {
		if (arr.length == 0) {
			return new int[0];
		}
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}

		}
		return Arrays.copyOf(arr, j + 1);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 2, 2 };
		int[] result = removeDuplicate(arr);
		System.out.println(Arrays.toString(result));
	}
}
