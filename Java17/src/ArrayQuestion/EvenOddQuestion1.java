package ArrayQuestion;

public class EvenOddQuestion1 {
	public static void main(String[] args) {
		// take a n of element 
		int[] arr = { 1, 6, 18, 7 };
		int even = 0;
		int odd = 0;
		for (int n : arr) {
			if (n % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println(even + " " + odd);
	}
}
