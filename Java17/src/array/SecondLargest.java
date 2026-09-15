package array;

public class SecondLargest {
	public static void getSecondLarget(int[] arr) {
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {

//				secondLargest = arr[i];
//				largest = arr[i];

				secondLargest = largest;
				largest = arr[i];

//				largest = arr[i];
//				secondLargest = largest;

//				int temp = largest;
//				largest = arr[i];
//				secondLargest = temp;

			} else if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}

		System.out.println(largest);

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > secondLargest && arr[i] < largest) {
//				secondLargest = arr[i];
//			}
//		}

		System.out.println(secondLargest);

	}

	public static void main(String[] args) {

		int[] arr = { 150, 50, 50, 90, 120, 10, 15, 0, 85, 60 };
		getSecondLarget(arr);
	}
}
