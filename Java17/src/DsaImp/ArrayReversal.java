package DsaImp;

import java.util.Arrays;

public class ArrayReversal {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("before :" + Arrays.toString(arr));
		reverseArray(arr);
		System.out.println("after :" + Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1; 
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}
}
