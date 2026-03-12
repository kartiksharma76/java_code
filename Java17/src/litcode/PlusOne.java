package litcode;

import java.util.Arrays;

public class PlusOne {
	public int[] plusone(int[] dight) {
		for (int i = dight.length - 1; i >= 0; i--) {
			if (dight[i] < 9) {
				dight[i]++;
				return dight;
			}
			dight[i] = 0;
		}
		int[] result = new int[dight.length + 1];
		result[0] = 1;
		return result;

	}

	public static void main(String[] args) {
		PlusOne one = new PlusOne();
		int[] arr = { 1, 2, 3 };
		int[] result = one.plusone(arr);
		System.out.println("Result: " + Arrays.toString(result));
	}
}
