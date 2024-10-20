package array;

public class EvenOdd3 {
	public static void numberEvenOdd(int arr[], int length) {
		int evennumber = 0;
		int oddnumber = 0;
		for (int i = 0; i < arr.length; i++) {

			if ((arr[i] & 1) == 1)
				evennumber++;

			else
				oddnumber++;

		}
		System.out.println("Number of even" + " elements = " + evennumber);
		System.out.println("Number of odd" + "element=" + oddnumber);
	}

	public static void main(String[] args) {
		{
			int arr[] = { 2, 3, 4, 5, 6 };
			int n = arr.length;
			numberEvenOdd(arr, n);
		}
	}
}
