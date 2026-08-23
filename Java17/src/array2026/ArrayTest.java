package array2026;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] aryNums;
		aryNums = new int[6];
		aryNums[0] = 10;
		aryNums[1] = 14;
		aryNums[2] = 36;
		aryNums[3] = 27;
		aryNums[4] = 43;
		aryNums[5] = 18;

		Arrays.sort(aryNums);

		for (int i = 0; i < aryNums.length; i++) {
			System.out.println("Nums :" + aryNums[i]);
		}

	}
}
