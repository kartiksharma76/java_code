package starpattern;

public class Pattern7 {
	public static void main(String[] args) {
		int rc = 5;
		int bc = 3;
		int sc = 1;

		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < rc; j++) {
				if (i == j || i + j == rc - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
