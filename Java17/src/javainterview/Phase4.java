package javainterview;

public class Phase4 {
	public static void main(String[] args) {
		int n = 5; // predefined value

		// 1. Tables 1 to 10
		System.out.println("1. Tables 1 to 10:");
		for (int i = 1; i <= 10; i++) {
			System.out.println("\nTable of " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		// 2. All pairs (i, j)
		System.out.println("\n2. All pairs:");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("(" + i + ", " + j + ")");
			}
		}
		// 3. Count factors of each number
		System.out.println("\n3. Factors count:");
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			System.out.println(i + " -> " + count + " factors");
		}

		// 4. Prime numbers up to n
		System.out.println("\n4. Prime numbers:");
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.print(i + " ");
		}

		// 5. Fibonacci pattern
		System.out.println("\n\n5. Fibonacci pattern:");
		int a = 0, b = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				int next = a + b;
				a = b;
				b = next;
			}
			System.out.println();
		}

		// 6. Number triangle
		System.out.println("\n6. Number triangle:");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 7. Matrix row sum & column sum
		System.out.println("\n7. Matrix:");
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Print matrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		// Row sum
		System.out.println("Row Sum:");
		for (int i = 0; i < 3; i++) {
			int rowSum = 0;
			for (int j = 0; j < 3; j++) {
				rowSum += mat[i][j];
			}
			System.out.println("Row " + i + " = " + rowSum);
		}

		// Column sum
		System.out.println("Column Sum:");
		for (int j = 0; j < 3; j++) {
			int colSum = 0;
			for (int i = 0; i < 3; i++) {
				colSum += mat[i][j];
			}
			System.out.println("Col " + j + " = " + colSum);
		}

		// 8. Pythagorean triplets
		System.out.println("\n8. Pythagorean triplets:");
		int limit = 20;
		for (int i = 1; i <= limit; i++) {
			for (int j = i; j <= limit; j++) {
				for (int k = j; k <= limit; k++) {
					if (i * i + j * j == k * k) {
						System.out.println(i + ", " + j + ", " + k);
					}
				}
			}
		}
	}
}
