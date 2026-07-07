package javaDsaPattern;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		// 1. Insert (Input)
		System.out.println("Enter 5 elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 2.Display
		System.out.println("Array: ");
		for (int num : arr) {
			System.out.println(num + " ");
		}

		// 3. Search
		System.out.print("\nEnter element to search: ");
		int key = sc.nextInt();

		boolean found = false;
		for (int num : arr) {
			if (num == key) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println("Element Found");
		else
			System.out.println("Element Not Found");

		// 4. Maximum

		int max = arr[0];
		for (int num : arr)
			if (num > max)
				max = num;
		System.out.println("Maximum: " + max);

		// 5. Minimum
		int min = arr[0];
		for (int num : arr)
			if (num < min)
				min = num;
		System.out.println("Minimum: " + min);

		// 6. Sum
		int sum = 0;
		for (int num : arr)
			sum += num;
		System.out.println("Sum: " + sum);

		// 7. Average
		System.out.println("Average: " + (double) sum / arr.length);

	}
}
