package Pattern2026;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}