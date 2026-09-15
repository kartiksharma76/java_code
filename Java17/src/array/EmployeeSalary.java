package array;

import java.util.Arrays;

public class EmployeeSalary {
	public static void main(String[] args) {
		int[] salaries = { 50, 60, 55, 80, 70, 65 };

		double mean = calculateMean(salaries);
		double median = calculateMedian(salaries);

		System.out.println("Employee Salaries (in thousands): " + Arrays.toString(salaries));
		System.out.println("Average Salary: " + mean + "k");
		System.out.println("Median Salary: " + median + "k");
	}

	private static double calculateMedian(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int n = arr.length;
		if (n % 2 == 0)
			return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
		else
			return arr[n / 2];
	}

	private static double calculateMean(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int val : arr)
			sum += val;
		return (double) sum / arr.length;
	}
}
