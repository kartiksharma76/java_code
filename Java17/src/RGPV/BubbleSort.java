package RGPV;

public class BubbleSort {
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

	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort();
		int[] arr = { 64, 34, 21, 40 };
		ob.bubblesort(arr);
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i]+" ");
		System.out.println();
	}

}
