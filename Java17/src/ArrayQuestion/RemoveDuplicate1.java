package ArrayQuestion;

import java.util.Arrays;

public class RemoveDuplicate1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 1, 2 };
		int n = arr.length;
		Arrays.sort(arr);// sort array

		int[] temp = new int[n];// temporary to store unique element
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];// last element are added
		int[] result = Arrays.copyOf(temp, j);// copy the element of original array
		System.out.println(Arrays.toString(result));// print
	}
}
