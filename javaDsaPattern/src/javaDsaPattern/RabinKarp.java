package javaDsaPattern;

//Rabin Karp Algorithm

public class RabinKarp {

	public static void search(String text, String pattern) {

		int d = 256;

		int q = 101;

		int m = pattern.length();

		int n = text.length();

		int p = 0;

		int t = 0;

		int h = 1;

		for (int i = 0; i < m - 1; i++) {

			h = (h * d) % q;
		}

		for (int i = 0; i < m; i++) {

			p = (d * p + pattern.charAt(i)) % q;

			t = (d * t + text.charAt(i)) % q;
		}

		for (int i = 0; i <= n - m; i++) {

			if (p == t) {

				int j;

				for (j = 0; j < m; j++) {

					if (text.charAt(i + j) != pattern.charAt(j)) {

						break;
					}
				}

				if (j == m) {

					System.out.println("Pattern Found at Index " + i);
				}
			}

			if (i < n - m) {

				t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;

				if (t < 0) {

					t = t + q;
				}
			}
		}
	}

	public static void main(String[] args) {

		String text = "ABCCDDAEFG";

		String pattern = "CDD";

		search(text, pattern);
	}
}