package nqttop150;

import java.util.Arrays;

public class ProductNoItself {
	public static int[] productExceptItself(int[] arr) {
		int n = arr.length;
		int[] output = new int[n];

		output[0] = 1;
		for (int i = 1; i < n; i++) {
			output[i] = output[i - 1] * arr[i - 1];

		}
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			output[i] *= suffix;
			suffix *= arr[i];
		}
		return output;
	}
	public static void main(String[] args) {
		int[]num= {1,2,4,6};
		int[]result=productExceptItself(num);
		System.out.println(Arrays.toString(result));
	}
}
