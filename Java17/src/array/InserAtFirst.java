package array;

public class InserAtFirst {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int elementToInsert = 5;

		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}

		newArr[0] = elementToInsert;

		System.out.print("Array after insertion: ");
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
