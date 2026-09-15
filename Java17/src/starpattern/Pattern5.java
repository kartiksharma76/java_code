package starpattern;

public class Pattern5 {
	public static void main(String[] args) {
		int rc = 4;
		int bc = 3;
		int sc = 1;
		for (int i = 0; i < rc; i++) {
			// printing space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// printing star
			for (int k = 0; k < (rc - i) * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// pyramid star pattern
		for (int i = 2; i <= rc; i++) {
			// printing spaces
			for (int j = rc; j > i; j--) {
				System.out.print(" ");
			}
			// printing star
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
