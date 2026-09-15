package array;

public class Evenodd5 {
	public static void printnumberevenodd(int[] arr, int length) {
		int evennumber = 0;
		int oddnumber = 0;

		for (int i = 0; i < arr.length; i++) {

			if ((arr[i] & 1) == 1) {
				evennumber++;

			} else {
				oddnumber++;
			}
		}
		System.out.println("print even number" + "element=" + evennumber);
		System.out.println("print odd number" + "element=" + oddnumber);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 6, 18, 7 };

		int n = arr.length;
		printnumberevenodd(arr, n);
	}
}
