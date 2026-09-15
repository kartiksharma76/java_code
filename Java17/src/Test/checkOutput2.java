package Test;

import java.util.Arrays;

public class checkOutput2 {
	public static void main(String[] args) {
		int[] ints = { 2, -1, 4, 5, 3 };
		Arrays.sort(ints);
		System.out.println(Arrays.binarySearch(ints, -1));
	}
}
// out put is 0