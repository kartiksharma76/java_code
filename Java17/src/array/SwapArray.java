package array;

import java.util.Scanner;

/**
 * 1. start
 * 2. Declare array
 * 3. Take two index position from user(index 1, index2)
 * 4. Stored value of first index in temp
 * 5. Replace first index value  with second index value
 * 6. Replace second index value with temp
 * 7. Print updated array
 * 8. stop
 */
public class SwapArray {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first index: ");
		int index1 = sc.nextInt();

		System.out.println("Enter second index :");
		int index2 = sc.nextInt();

		// swap using index
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

		System.out.println("Array after changing position:");
		for (int i : arr) {
			System.out.println(i + " ");
		}
	}
}
