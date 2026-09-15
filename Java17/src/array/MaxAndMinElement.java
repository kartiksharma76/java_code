package array;

public class MaxAndMinElement {

	public static void main(String[] args) {

		int[] arr = { 50, 90, 10, 15, 85, 60 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max)

			{
				max = arr[i];

			}
		}
		System.out.println("Maximum Element is array is:" + max);

		int[] arr1 = { 50, 90, 10, 15, 85, 60 };
		int min = arr1[0];

		for (int i = 1; i < arr1.length; i++) {

			if (arr1[i] < min) {

				min = arr1[i];
			}

		}

		System.out.println("Minimum Element is Array is:" + min);
	}
}
