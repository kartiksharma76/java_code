package javainterview;

public class MatrixSub {
	public static void main(String[] args) {
		int a[][] = { { 5, 6 }, { 7, 8 } };
		int b[][] = { { 1, 2 }, { 3, 4 } };
		int c[][] = new int[2][2];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				c[i][j] = a[i][j] - b[i][j];
		System.out.println(c[0][0] + " " + c[0][1]);
		System.out.println(c[1][0] + " " + c[1][1]);
	}
}