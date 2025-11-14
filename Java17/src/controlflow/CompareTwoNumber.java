package controlflow;

public class CompareTwoNumber {
//	public static int m1(int a, int b) {
//		a = 10;
//		b = 20;
//		if (a < b) {
//			return a;
//		} else {
//			return b;
//		}
//	}
//	public static void main(String[] args) {
//		CompareTwoNumber b = new CompareTwoNumber();
//		System.out.println(CompareTwoNumber.m1(10, 20));
//	}

//	public static void main(String[] args) {
//		int a = 20;
//		System.out.println("Multiplication Table of " + a + ":");
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(a + "x" + i + "=" + (a * i));
//		}
//	}

	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("Multiplication Table of :" + i + ":");
//			for (int j = 1; j <= 10; j++) {
//				System.out.println(i + " X " + j + "=" + (i * j));
//
//			}
//			System.out.println();
//		}

		int[][][] arr = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80, 90 }, { 100, 110, 120 } } };

		System.out.println("Full 3D Array Indexing:");
		for (int i = 0; i < arr.length; i++) { // Layer
			for (int j = 0; j < arr[i].length; j++) { // Row
				for (int k = 0; k < arr[i][j].length; k++) { // Column
					System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + arr[i][j][k]);
				}
			}
		}
	}
}