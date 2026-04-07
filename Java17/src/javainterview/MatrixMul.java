package javainterview;

public class MatrixMul {
	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 5, 6 }, { 7, 8 } };
		int c[][] = new int[2][2];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				for (int k = 0; k < 2; k++)
					c[i][j] += a[i][k] * b[k][j];
		System.out.println(c[0][0] + " " + c[0][1]);
		System.out.println(c[1][0] + " " + c[1][1]);
	}
}
