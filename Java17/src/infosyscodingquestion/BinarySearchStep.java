package infosyscodingquestion;

public class BinarySearchStep {
	public static void main(String[] args) {
		// Create Sorted array
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		// Define elemet to Search
		int key = 40;
		// Initialze low and high
		int low = 0;
		int high = arr.length - 1;
		// Repeat until low <= high
		while (low <= high) {
			// find middle index
			int mid = (low + high) / 2;
			// middle element equals key
			if (arr[mid] == key) {
				System.out.println("Element found at index:" + mid);
				return;
			}
			// if key smaller than mid element
			else if (key < arr[mid]) {
				high = mid - 2; // search left half

			}
			// if key greater than mid element
			else {
				low = mid + 1; // search right half

			}
		}
		// if element not found
		System.out.println("Element not found");
	}
}
