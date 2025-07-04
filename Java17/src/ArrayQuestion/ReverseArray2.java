package ArrayQuestion;

public class ReverseArray2 {
	public static void arrayreverse(int[] array) {
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("original array:");
		for (int num : arr) {
			System.out.println(num + " ");
		}
		arrayreverse(arr);
		System.out.println("\narray reverseal");
		for (int num : arr) {
			System.out.println(num + "");
		}
	}
}
