package infosyscodingquestion;

public class BinarySearchRecursive {
	static int binarySearch(int[] arr, int low, int high, int key) {
		// if low <= high

		if (low <= high) {
// find mid

			int mid = (low + high) / 2;
// if key found 
			if (arr[mid] == key)
				return mid;

// if key smaller -> seach left
			if (key < arr[mid])
				return binarySearch(arr, low, mid - 1, key);
// if key greater-> serch right
			return binarySearch(arr, mid + 1, high, key);
		}
		// Not found
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 10, 15, 20, 25, 30 };
		int key = 20;
		int result = binarySearch(arr, 0, arr.length - 1, key);
		if (result != -1)
			System.out.println("Element found at index:" + result);
		else
			System.out.println("element not found");
	}
}