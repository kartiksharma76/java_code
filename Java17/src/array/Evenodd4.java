package array;

public class Evenodd4 {
	public static void numberEvenOdd(int arr[], int length) {
		int evennumber = 0;
		int oddnumber = 0;
		for (int i = 0; i < arr.length; i++) {

			if ((arr[i] & 1) == 1) {
				oddnumber++;
			} else {
				evennumber++;
			}
		}
		System.out.println("Number of even" + " elements = " + evennumber);
		System.out.println("Number of odd" + "element=" + oddnumber);
	}

	public static void main(String[] args) {
		{
			int arr[] = { 1, 2, 3, 4, 5 };
			int n = arr.length;
			numberEvenOdd(arr, n);
		}
	}
}
