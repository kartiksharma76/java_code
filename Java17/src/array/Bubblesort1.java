package array;

public class Bubblesort1 {
	public void Bubblsort1(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
	}

	void printarray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Bubblesort1 ob = new Bubblesort1();
		int[] b = { 2, 1, 4, 7, 6, 9, 0, 8, 3 };
		ob.Bubblsort1(b);
		System.out.println("sorted array");
		ob.printarray(b);
	}
}
