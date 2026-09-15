package InterviewPrepImpQue;

public class CountEvenCounts {
	public static void main(String[] args) {
		int[] arr = { 1, 6, 18, 7 };
		int even = 0;
		int odd = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("even:" + even + "odd:" + odd);
	}
}
