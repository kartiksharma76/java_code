package InterviewPrepImpQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegragateFunction {
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
		System.out.println("Original Arrays:" + Arrays.toString(arr));
		System.out.println();
		System.out.println("Even Elements: " + even);
		System.out.println("Odd Elements: " + odd);
	}

	public static void main(String[] args) {
		int[] arr = { 12, 34, 45, 9, 8, 90, 3 };
		segrigate(arr);
	}
}
