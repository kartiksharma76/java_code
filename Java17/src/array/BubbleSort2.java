package array;

public class BubbleSort2 {

	public void BubbleSort2(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 6, 7, 8, 9, 0 };
		BubbleSort b = new BubbleSort();
		b.BubbleSort(a);

		int n = a.length;
		for (int i = 0; i < n; ++i) {
			System.out.println(a[i] + " ");

		}

	}

}
