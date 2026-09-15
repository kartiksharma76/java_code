package array;

public class Insertion {
	public static void main(String[] args) {
		int sizeOfArray = 5;
		int[] arr = { 1, 2, 3, 4, 5 };
		int element = 90;

		// Create a new array with one more size
		int[] newArr = new int[sizeOfArray + 1];

		// Copy elements from the old array to the new array
		for (int i = 0; i < sizeOfArray; i++) {
			newArr[i] = arr[i];
		}

		// Insert the new element at the end of the new array
		newArr[sizeOfArray] = element;

		// Print the new array
		for (int i = 0; i < sizeOfArray + 1; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
