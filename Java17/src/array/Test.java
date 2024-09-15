package array;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[4];
		byte b = 20;
		short s = 30;
		char c = 'A';

		arr[0] = 10;
		arr[1] = b;
		arr[2] = s;
		arr[3] = c;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
