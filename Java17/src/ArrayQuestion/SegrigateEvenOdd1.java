package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SegrigateEvenOdd1 {
	public static void segrigate(int[] arr) {
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();

		for (int num : arr) {
			if (num % 2 == 0) {
				even.add(num);
			} else {
				odd.add(num);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		int index = 0;
		for (int num : even) {
			arr[index++] = num;
		}
		for (int num : odd) {
			arr[index++] = num;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		segrigate(arr);
		System.out.println(Arrays.toString(arr));
	}
}