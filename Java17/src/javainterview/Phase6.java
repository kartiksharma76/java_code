package javainterview;

public class Phase6 {

	public static void main(String[] args) {

		int n = 5; // predefined
		int x = 2; // for series

		// 1. Sum of first n natural numbers
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1. Sum Natural = " + sum);

		// 2. Sum of first n even numbers
		int evenSum = 0;
		for (int i = 1; i <= n; i++) {
			evenSum += (2 * i);
		}
		System.out.println("2. Sum Even = " + evenSum);

		// 3. Sum of first n odd numbers
		int oddSum = 0;
		for (int i = 1; i <= n; i++) {
			oddSum += (2 * i - 1);
		}
		System.out.println("3. Sum Odd = " + oddSum);

		// 4. Arithmetic Progression
		int a = 2, d = 3;
		System.out.print("4. AP: ");
		for (int i = 0; i < n; i++) {
			System.out.print((a + i * d) + " ");
		}

		// 5. Geometric Progression
		int r = 2;
		int gp = a;
		System.out.print("\n5. GP: ");
		for (int i = 0; i < n; i++) {
			System.out.print(gp + " ");
			gp *= r;
		}

		// 6. Fibonacci
		int f1 = 0, f2 = 1;
		System.out.print("\n6. Fibonacci: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(f1 + " ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}

		// 7. Sum of Fibonacci
		f1 = 0;
		f2 = 1;
		int sumFib = 0;
		for (int i = 1; i <= n; i++) {
			sumFib += f1;
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
		System.out.println("\n7. Sum Fibonacci = " + sumFib);

		// 8. Sum of squares
		int sumSq = 0;
		for (int i = 1; i <= n; i++) {
			sumSq += i * i;
		}
		System.out.println("8. Sum Squares = " + sumSq);

		// 9. Sum of cubes
		int sumCube = 0;
		for (int i = 1; i <= n; i++) {
			sumCube += i * i * i;
		}
		System.out.println("9. Sum Cubes = " + sumCube);

		// 10. Harmonic series
		double sumH = 0;
		for (int i = 1; i <= n; i++) {
			sumH += 1.0 / i;
		}
		System.out.println("10. Harmonic = " + sumH);

		// 11. Powers of 2
		int power = 1;
		System.out.print("11. Powers of 2: ");
		for (int i = 0; i <= n; i++) {
			System.out.print(power + " ");
			power *= 2;
		}

		// 12. Sum of factorials
		int sumFact = 0;
		for (int i = 1; i <= n; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact *= j;
			}
			sumFact += fact;
		}
		System.out.println("\n12. Sum Factorial = " + sumFact);

		// 13. 1 + x + x^2 + ...
		int sumPow = 0;
		int p = 1;
		for (int i = 0; i <= n; i++) {
			sumPow += p;
			p *= x;
		}
		System.out.println("13. Power Series = " + sumPow);

		// 14. x - x^2/2! + x^3/3! - ...
		double series = 0;
		int sign = 1;

		for (int i = 1; i <= n; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact *= j;
			}
			series += sign * Math.pow(x, i) / fact;
			sign *= -1;
		}
		System.out.println("14. Series = " + series);

		// 15. Strong number
		int num = 145;
		int temp = num;
		int sumStrong = 0;

		while (temp != 0) {
			int d1 = temp % 10;

			int fact = 1;
			for (int i = 1; i <= d1; i++) {
				fact *= i;
			}

			sumStrong += fact;
			temp /= 10;
		}

		if (sumStrong == num) {
			System.out.println("15. Strong Number");
		} else {
			System.out.println("15. Not Strong");
		}
	}
}