package arrays;

public class EquilibriumPoint {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 2 };
		int totalSum = 0;

		for (int num : arr) {
			totalSum += num;
		}

		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum -= arr[i];

			if (leftSum == totalSum) {
				System.out.println("Equilibrium Index: " + i);
				return;
			}
			leftSum += arr[i];
		}
		System.out.println("No Equilibrium Point");

	}
}
