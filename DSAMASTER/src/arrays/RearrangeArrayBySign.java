package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayBySign {
	public static void main(String[] args) {
		int[] arr = { 3, 1, -2, -5, 2, -4 };

		ArrayList<Integer> positive = new ArrayList<Integer>();
		ArrayList<Integer> negative = new ArrayList<Integer>();

		for (int num : arr) {
			if (num >= 0) {
				positive.add(num);
			} else {
				negative.add(num);
			}
		}
		int i = 0, p = 0, n = 0;

		while (p < positive.size() && n < negative.size()) {
			arr[i++] = positive.get(p++);
			arr[i++] = negative.get(n++);
		}

		while (p < positive.size()) {
			arr[i++] = positive.get(p++);

		}

		while (n < negative.size()) {
			arr[i++] = negative.get(n++);
		}

		System.out.print("Rearranged Array: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
