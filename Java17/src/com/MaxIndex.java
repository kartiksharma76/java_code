package Google.com;

public class MaxIndex {
	public static int findMaxIndex(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}

		}
		return maxIndex;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 10, 2, 8, 15, 6 };
		int index = findMaxIndex(arr);

		System.out.println("Maximun element index :" + index);
		System.out.println("Maximun element value:" + arr[index]);
	}
}
