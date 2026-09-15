package array;

public class BubbleSort4 {
	public void bubblesort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		BubbleSort4 b = new BubbleSort4();
		int[] a = { 64, 34, 25, 12 };
		b.bubblesort(a);
		int n = a.length;

		for (int i = 0; i < n; ++i) {
			System.out.println(a[i] + " ");
		}
	}
}
