package array;

public class Secondlargest1 {
	public static void getsecondlargest(int[] arr) {
		int largest = 0;
		int secondlargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {

				secondlargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondlargest && arr[i] < largest) {
				secondlargest = arr[i];
			}
		}
		System.out.println(secondlargest);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		getsecondlargest(arr);

	}
}
