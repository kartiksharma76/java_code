package array;

public class BubbleSort3 {
	public void bubblesort(int[] arr) {
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
		BubbleSort3 ob = new BubbleSort3();
		int[] arr = { 3, 5, 6, 2, 4, 6, 8, 6 };
		ob.bubblesort(arr);
		System.out.println("sorted array");
		ob.printArray(arr);
	}
}
