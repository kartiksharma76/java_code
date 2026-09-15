package array2026;

import java.util.Arrays;
import java.util.Collections;

public class AscendingOrder {
	public static void main(String[] args) {
		int[] aryNums;
		aryNums = new int[6];
		aryNums[0] = 10;
		aryNums[1] = 14;
		aryNums[2] = 36;
		aryNums[3] = 27;
		aryNums[4] = 43;
		aryNums[5] = 18;

		Integer[] integerArray = new Integer[aryNums.length];

		for (int i = 0; i < aryNums.length; i++) {
			integerArray[i] = new Integer(aryNums[i]);

		}
		Arrays.sort(integerArray, Collections.reverseOrder());

		for (int i = 0; i < integerArray.length; i++) {
			System.out.println(integerArray[i]);
		}
	}
}
