package array;

import java.util.Arrays;
import java.util.Collections;

public class RevreseArray {
	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 30, 40, 50 };

		//4 approach
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
		
		
		
		// 3approach
//		Collections.reverse(Arrays.asList(arr));
//		System.out.println(Arrays.toString(arr));
		
		
		
		// secondeappoach
//		int[] rev = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			rev[i] = arr[arr.length - 1 - i];
//
//		}
//
//		for (int num : rev) {
//			System.out.println(num + " ");
//		}
		

		
		
		// first approach
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int num : arr) {
			System.out.println(num);
		}
		
		

	}
}
