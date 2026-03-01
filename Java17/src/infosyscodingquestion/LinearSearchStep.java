package infosyscodingquestion;

public class LinearSearchStep {
	public static void main(String[] args) {

		// Step 1: Create an Array
		int[] arr = { 10, 25, 30, 45, 30 };

		// Step 2: Define element to search
		int key = 30;

		// Step 3: Assume element not found
		boolean found = false;

		// Step 4: Traverse array
		for (int i = 0; i < arr.length; i++) {

			// Step 5: Compare current element with key
			if (arr[i] == key) {

				// Step 6: If match found
				System.out.println("Element found at index: " + i);
				found = true;

				// Stop searching
				break;
			}
		}

		// Step 7: If not found
		if (!found) {
			System.out.println("Element not found");
		}
	}
}