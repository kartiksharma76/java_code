package Infoces;

public class DecimalToBinary {
	public static void main(String[] args) {
		int d = 12;
		int b[] = new int[20];
		int i = 0;
		while (d > 0) {
			int r = d % 2;
			b[i++] = r;
			d = d / 2;

		}
		System.out.println("Binary number:");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(b[j] + " ");

		}
	}
}
