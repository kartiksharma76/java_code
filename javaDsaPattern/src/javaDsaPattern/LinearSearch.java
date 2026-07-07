package javaDsaPattern;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter element to search :");
		int key = sc.nextInt();

		int index = linearSearch(arr, key);

		if (index != -1)
			System.out.println("Element Found at Index: " + index);
		else
			System.out.println("Element Not Found");

		sc.close();

	}
}
