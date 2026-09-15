package Test;

import java.util.Arrays;

public class CheckOutput1 {
	public static void main(String[] args) {
		int ints[] = new int[4];
		ints[0] = 1;
		ints[1] = 2;
		ints[2] = 3;
		ints[3] = 4;

		int ins[] = Arrays.copyOf(ints, 5);
		for (int x : ins) {
			System.out.println(x);
		}
	}
}
