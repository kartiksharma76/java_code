package array;

public class BubbleSort {
	void BubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
	}

	void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i] + " ");
		System.out.println();

	}

	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort();
		int[] arr = { 5, 11, 15, 3, 20, 25, 30, 100 };
		ob.BubbleSort(arr);
		System.out.println("sorted array");
		ob.printArray(arr);

	}

}
