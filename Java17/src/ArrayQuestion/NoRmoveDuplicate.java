package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoRmoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			list.add(num);

		}
		int[] result = new int[list.size()];
		int index = 0;
		for (int num : list) {
			result[index++] = num;
		}
		System.out.println(Arrays.toString(result));
	}
}
