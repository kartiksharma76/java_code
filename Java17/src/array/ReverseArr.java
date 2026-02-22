package array;

public class ReverseArr {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };

		int s = 0;
		int e = arr.length - 1;

		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;

			s++;
			e--;

		}
		System.out.println("Revesred array:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
