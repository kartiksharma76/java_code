package ArrayQuestion;

public class EvenOdd {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 5, 4, 6 };
		int evencount = 0;
		int oddcount = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		System.out.println(evencount + " " + oddcount);
	}
}
