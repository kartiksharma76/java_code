package array;

import java.util.Scanner;
/**
 * 1. start
 * 2. Create Scanner object
 * 3. input size of array n
 * 4. Create array of size n
 * 5. input array element
 * 6. Set start = 0, end = n - 1
 * 7. while start < end
 *      Swap arr[start] and arr[end]
 *      start++, end--
 * 8. Print reversed array
 * 9. Stop
 */
public class ReverseScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter size of Array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter array element:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int start = 0;
		int end = n - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

		System.out.println("Reversed array:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
