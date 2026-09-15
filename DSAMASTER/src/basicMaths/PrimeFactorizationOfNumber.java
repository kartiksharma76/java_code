package basicMaths;

public class PrimeFactorizationOfNumber {
	public static void main(String[] args) {
		int num = 60;
		System.out.print("Prime Factors: ");

		for (int i = 2; i * i <= num; i++) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num /= i;
			}
		}

		if (num > 1) {
			System.out.print(num);
		}
	}
}
