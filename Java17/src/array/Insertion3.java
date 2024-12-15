package array;

public class Insertion3 {
	public static void main(String[] args) {
		int sizeofarray = 5;
		int[] arr = { 20, 30, 40, 50, 60 };
		int element = 100;

		int[] newArr = new int[sizeofarray + 1];
		for (int i = 0; i < sizeofarray; i++) {
			newArr[i] = arr[i];
         
		}
		newArr[sizeofarray] = element;
		for (int i = 0; i < sizeofarray + 1; i++) {
			System.out.println(newArr[i]);
		}
	}
}
