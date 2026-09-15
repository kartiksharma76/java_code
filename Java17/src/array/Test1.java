package array;

public class Test1 {
	public static void main(String[] args) {
		double[] arr = new double[7];
		byte b = 20;
		short s = 30;
		char c = 'A';
		long L = 40;
		float f = 50;

		boolean bol = false;

		arr[0] = 10;
		arr[1] = b;
		arr[2] = s;
		arr[3] = c;
		arr[4] = L;
		arr[5] = f;
		arr[6] = 60.5;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int[] arr1 = { 10, 20 };
		int[] arr2 = { 30, 40, 50, 60 };
		arr1 = arr2;
		arr2 = arr1;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("**************");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
