package array;
import java.util.Arrays;
public class ClosetSumToZero {
	public static int[] findclosetSumtozero(int[] arr) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int minsum = Integer.MAX_VALUE;
		int result[] = new int[2];
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (Math.abs(sum) < Math.abs(minsum)) {
				minsum = sum;
				result[0] = arr[left];
				result[1] = arr[right];
			}
			if (sum < 0) {
				left++;
			} else {
				right--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 70, -80, 85 };
		int[] closetsumpair = findclosetSumtozero(arr);
		System.out.println(closetsumpair[0] + "and" + closetsumpair[1]);
	}
}
