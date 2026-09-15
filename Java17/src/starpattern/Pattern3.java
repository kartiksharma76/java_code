package starpattern;

public class Pattern3 {
	public static void main(String[] args) {
		int rc = 4;
		int bc = 3;
		int sc = 1;
		for (int i = 0; i < rc; i++) {

			for (int j = 0; j < rc - i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
