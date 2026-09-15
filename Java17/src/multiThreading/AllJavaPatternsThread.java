package multiThreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AllJavaPatternsThread {

	public static void main(String[] args) {

		Runnable patternThread = () -> {

			StringBuilder sb = new StringBuilder();

			// =====================================================
			// STAR TRIANGLE
			// =====================================================

			sb.append("========== STAR TRIANGLE ==========\n\n");

			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= i; j++) {

					sb.append("* ");
				}

				sb.append("\n");
			}

			// =====================================================
			// REVERSE STAR TRIANGLE
			// =====================================================

			sb.append("\n========== REVERSE STAR TRIANGLE ==========\n\n");

			for (int i = 5; i >= 1; i--) {

				for (int j = 1; j <= i; j++) {

					sb.append("* ");
				}

				sb.append("\n");
			}

			// =====================================================
			// RIGHT PYRAMID
			// =====================================================

			sb.append("\n========== RIGHT PYRAMID ==========\n\n");

			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= 5 - i; j++) {

					sb.append(" ");
				}

				for (int k = 1; k <= i; k++) {

					sb.append("* ");
				}

				sb.append("\n");
			}

			// =====================================================
			// FULL PYRAMID
			// =====================================================

			sb.append("\n========== FULL PYRAMID ==========\n\n");

			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= 5 - i; j++) {

					sb.append(" ");
				}

				for (int k = 1; k <= (2 * i - 1); k++) {

					sb.append("*");
				}

				sb.append("\n");
			}

			// =====================================================
			// REVERSE PYRAMID
			// =====================================================

			sb.append("\n========== REVERSE PYRAMID ==========\n\n");

			for (int i = 5; i >= 1; i--) {

				for (int j = 1; j <= 5 - i; j++) {

					sb.append(" ");
				}

				for (int k = 1; k <= (2 * i - 1); k++) {

					sb.append("*");
				}

				sb.append("\n");
			}

			// =====================================================
			// DIAMOND PATTERN
			// =====================================================

			sb.append("\n========== DIAMOND PATTERN ==========\n\n");

			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= 5 - i; j++) {

					sb.append(" ");
				}

				for (int k = 1; k <= (2 * i - 1); k++) {

					sb.append("*");
				}

				sb.append("\n");
			}

			for (int i = 4; i >= 1; i--) {

				for (int j = 1; j <= 5 - i; j++) {

					sb.append(" ");
				}

				for (int k = 1; k <= (2 * i - 1); k++) {

					sb.append("*");
				}

				sb.append("\n");
			}

			// =====================================================
			// NUMBER TRIANGLE
			// =====================================================

			sb.append("\n========== NUMBER TRIANGLE ==========\n\n");

			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= i; j++) {

					sb.append(j).append(" ");
				}

				sb.append("\n");
			}

			// =====================================================
			// REVERSE NUMBER TRIANGLE
			// =====================================================

			sb.append("\n========== REVERSE NUMBER TRIANGLE ==========\n\n");

			for (int i = 5; i >= 1; i--) {

				for (int j = 1; j <= i; j++) {

					sb.append(j).append(" ");
				}

				sb.append("\n");
			}

			// =====================================================
			// SAME NUMBER PATTERN
			// =====================================================

			sb.append("\n========== SAME NUMBER PATTERN ==========\n\n");

			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= i; j++) {

					sb.append(i).append(" ");
				}

				sb.append("\n");
			}

			// =====================================================
			// CONTINUOUS NUMBER PATTERN
			// =====================================================

			sb.append("\n========== CONTINUOUS NUMBER PATTERN ==========\n\n");

			int num = 1;

			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= i; j++) {

					sb.append(num++).append(" ");
				}

				sb.append("\n");
			}

			// =====================================================
			// ALPHABET TRIANGLE
			// =====================================================

			sb.append("\n========== ALPHABET TRIANGLE ==========\n\n");

			for (char i = 'A'; i <= 'E'; i++) {

				for (char j = 'A'; j <= i; j++) {

					sb.append(j).append(" ");
				}

				sb.append("\n");
			}

			// =====================================================
			// SAME ALPHABET PATTERN
			// =====================================================

			sb.append("\n========== SAME ALPHABET PATTERN ==========\n\n");

			for (char i = 'A'; i <= 'E'; i++) {

				for (char j = 'A'; j <= i; j++) {

					sb.append(i).append(" ");
				}

				sb.append("\n");
			}

			// =====================================================
			// HOLLOW SQUARE
			// =====================================================

			sb.append("\n========== HOLLOW SQUARE ==========\n\n");

			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= 5; j++) {

					if (i == 1 || i == 5 || j == 1 || j == 5) {

						sb.append("* ");
					} else {

						sb.append("  ");
					}
				}

				sb.append("\n");
			}

			// =====================================================
			// HOLLOW PYRAMID
			// =====================================================

			sb.append("\n========== HOLLOW PYRAMID ==========\n\n");

			int rows = 5;

			for (int i = 1; i <= rows; i++) {

				for (int j = i; j < rows; j++) {

					sb.append(" ");
				}

				for (int k = 1; k <= (2 * i - 1); k++) {

					if (k == 1 || k == (2 * i - 1) || i == rows) {

						sb.append("*");
					} else {

						sb.append(" ");
					}
				}

				sb.append("\n");
			}

			// =====================================================
			// BUTTERFLY PATTERN
			// =====================================================

			sb.append("\n========== BUTTERFLY PATTERN ==========\n\n");

			int n = 5;

			for (int i = 1; i <= n; i++) {

				for (int j = 1; j <= i; j++) {

					sb.append("*");
				}

				for (int j = 1; j <= 2 * (n - i); j++) {

					sb.append(" ");
				}

				for (int j = 1; j <= i; j++) {

					sb.append("*");
				}

				sb.append("\n");
			}

			for (int i = n; i >= 1; i--) {

				for (int j = 1; j <= i; j++) {

					sb.append("*");
				}

				for (int j = 1; j <= 2 * (n - i); j++) {

					sb.append(" ");
				}

				for (int j = 1; j <= i; j++) {

					sb.append("*");
				}

				sb.append("\n");
			}

			// =====================================================
			// SAVE FILE
			// =====================================================

			Path path = Paths.get("src", "multiThreading", "AllPatterns.txt");

			try {

				Files.write(path, sb.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE,
						StandardOpenOption.TRUNCATE_EXISTING);

				System.out.println("All Patterns Saved Successfully");
				System.out.println("File Location : " + path.toAbsolutePath());

			} catch (IOException e) {

				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(patternThread, "Pattern Thread");

		t1.start();
	}
}