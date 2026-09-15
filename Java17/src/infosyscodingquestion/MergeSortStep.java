package infosyscodingquestion;

public class MergeSortStep {

	// Step 1: merge function
	void merge(int arr[], int l, int m, int r) {

		// Step 2: find sizes
		int n1 = m - l + 1;
		int n2 = r - m;

		// Step 3: create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		// Step 4: copy data
		for (int i = 0; i < n1; i++)
			L[i] = arr[l + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];

		// Step 5: merge arrays
		int i = 0, j = 0, k = l;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Step 6: copy remaining
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Step 7: merge sort function
	void sort(int arr[], int l, int r) {
		if (l < r) {

			// Step 8: find mid
			int m = (l + r) / 2;

			// Step 9: sort left
			sort(arr, l, m);

			// Step 10: sort right
			sort(arr, m + 1, r);

			// Step 11: merge
			merge(arr, l, m, r);
		}
	}

	public static void main(String[] args) {

		// Step 12: create array
		int arr[] = { 12, 11, 13, 5, 6 };

		MergeSortStep ob = new MergeSortStep();

		// Step 13: call sort
		ob.sort(arr, 0, arr.length - 1);

		// Step 14: print array
		System.out.println("Sorted array:");
		for (int x : arr)
			System.out.print(x + " ");
	}
}