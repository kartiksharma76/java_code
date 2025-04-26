package Test1;

public class Whiz7 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 3, 5 }, { 7, 8 } };
		out: for (int[] a : arr) {
			for (int i : a) {
//				if (i == 7)
//					continue out;
//				System.out.print(i + " ");
//				if (i == 3)
//					break;output 1,3
				if (i == 7)
					continue;
				System.out.print(i + " ");
				if (i == 3)
					break;// 1,3,8
			}
		}
	}
}
