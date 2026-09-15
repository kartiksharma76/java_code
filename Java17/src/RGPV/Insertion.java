package RGPV;

public class Insertion {
	public static void main(String[] args) {
		int sizeofArray = 5;
		int arr[] = { 10, 20, 30, 40, 50 };
		int element = 100;
		int[] newarr = new int[sizeofArray + 1];
		for (int i = 0; i < sizeofArray; i++) {
			newarr[i] = arr[i];
		}
		newarr[sizeofArray] = element;
		for (int i = 0; i < sizeofArray + 1; i++) {
			System.out.println(newarr[i] + " ");
		}
	}
}
