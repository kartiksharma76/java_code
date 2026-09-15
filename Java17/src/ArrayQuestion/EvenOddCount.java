package ArrayQuestion;

// print even count output is 3,2
public class EvenOddCount {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int evencount = 0;
		int oddount = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evencount++;

			} else {
				oddount++;
			}
		}
		System.out.println(oddount + " " + evencount);
	}
}
