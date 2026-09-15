package javainterview;

import java.util.Arrays;
/**
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

[1, 4, 7]
[2, 5, 8]
[3, 6, 9]

[3, 6, 9]
[2, 5, 8]
[1, 4, 7]
 */
public class E {
	public static void main(String[] args) {
		int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int k[] : x) {
			System.out.println(Arrays.toString(k));

		}
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x[i].length; j++) {
				int t = x[i][j];
				x[i][j] = x[j][i];
				x[j][i] = t;
			}
		}
		System.out.println();
		for (int k[] : x) {
			System.out.println(Arrays.toString(k));

		}
		for (int i = 0; i < x.length / 2; i++) {
			int t[] = x[i];
			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = t;
		}
		System.out.println();

		for (int k[] : x) {
			System.out.println(Arrays.toString(k));
		}

	}
}
