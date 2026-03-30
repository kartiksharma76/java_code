package InterviewPrepImpQue;

public class MagicalNumber {
	public static int findMagical(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == mid) {
				result = mid;
				high = mid - 1;
			} else if (arr[mid] > mid) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { -2, -1, 2, 4, 6 };
		System.out.println(findMagical(arr1)); // 2

		int[] arr2 = { -1, 1, 2, 3, 5, 7 };
		System.out.println(findMagical(arr2)); // 1
	}
}
