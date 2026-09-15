package Infoces;

public class DecimalToOctal {
	public static void main(String[] args) {
		int d = 148;
		int oct[] = new int[20];
		int i = 0;
		while (d > 0) {
			int r = d % 8;
			oct[i++] = r;
			d = d / 8;

		}
		System.out.println("Octal number :");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(oct[j]);
		}
	}
}
