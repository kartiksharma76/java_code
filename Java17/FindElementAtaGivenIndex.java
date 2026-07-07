package arrays;

public class FindElementAtaGivenIndex {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int index = 2;

		if (index >= 0 && index < arr.length) {
			System.out.println("Element at index " + index + " is :" + arr[index]);
		} else {
			System.out.println("Invalid Index");
		}
	}
}
