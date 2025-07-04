package ArrayQuestion;
/**
 * largest and second largest are initialize to Integer.MIN_VALUE
 * loop will goes
 * throw the array of ech data if the number is greater than largest then:
 * second largest become the new number largest become new number else become
 * the number is greater than the second largest and not equal to largest ,
 * update second largest if second largest was never update(Integer.MIN_VALUE
 * return-1.
 */
public class SecondLargest {
	public static int findsecondlargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondlargest = largest;
				largest = num;
			} else if (num > secondlargest && num != largest) {
				secondlargest = num;
			}
		}
		return secondlargest == Integer.MIN_VALUE ? -1 : secondlargest;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int result = findsecondlargest(arr);
		if (result != -1) {
			System.out.println("second largest:" + result);
		} else {
			System.out.println("second largest not found");
		}
	}
}
