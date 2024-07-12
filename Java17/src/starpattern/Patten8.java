package starpattern;

public class Patten8 {
	public static void main(String[] args) {
		int rc = 4;
		int bc = 3;
		int sc = 0;

		for (int i = 1; i <= rc; i++) {
			for (int j = 0; j < rc - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= rc - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < rc - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
