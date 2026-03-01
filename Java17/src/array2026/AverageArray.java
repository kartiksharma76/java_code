package array2026;

/**
 * Average= Sum/Total Elements ​
 * 
 */
public class AverageArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = (double) sum / arr.length;
		System.out.println("Average =" + average);
	}
}
