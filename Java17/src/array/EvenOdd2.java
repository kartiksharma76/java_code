package array;

public class EvenOdd2 {
	public static void main(String[] args) {

		int[] arr = { 10, 28288, 38883, 383829, 674367, 3278, 3432, 242 };
		System.out.println("print odd number:");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.println();

		System.out.print("print even number:");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
