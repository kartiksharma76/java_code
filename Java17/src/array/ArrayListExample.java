package array;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		System.out.println("Array1: " + arr1);
		System.out.println("Array2:" + arr2);

		for (int i = 1; i <= n; i++) {
			arr1.add(i);
			arr2.add(i);

		}
		System.out.println("Array 1:" + arr1);
		System.out.println(" Array 2:" + arr2);
	}
}
