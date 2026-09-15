package array;

public class Insertion1 {
	public static void main(String[] args) {
		int sizeofarray = 6;
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int element = 100;

		int[] newarr = new int[sizeofarray + 1];

		for (int i = 0; i < sizeofarray; i++) {
			newarr[i] = arr[i];

		}
		newarr[sizeofarray] = element;
		for (int i = 0; i < sizeofarray + 1; i++) {
			System.out.println(newarr[i] + "");
		}
	}
}
