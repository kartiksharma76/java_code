package companywisequestion;

//Question:
//Daily website visitors ka data diya hai.
//Continuous days ka aisa subarray find karo
//jiska sum target ke equal ho.

public class SubarraySum {
	public static void main(String[] args) {
		int[] visitors = { 1, 2, 3, 7, 5 };
		int target = 12;

		int start = 0;
		int sum = 0;

		for (int end = 0; end < visitors.length; end++) {
			sum += visitors[end];

			while (sum > target) {
				sum -= visitors[start];
				start++;
			}
			if (sum == target) {
				System.out.println("Subarray Found from Index " + start + " to " + end);
				return;
			}
		}
		System.out.println("No Subarray Found");
	}
}
