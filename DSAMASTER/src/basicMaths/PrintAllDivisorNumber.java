package basicMaths;

public class PrintAllDivisorNumber {
	public static void main(String[] args) {

		int num = 36;
		System.out.println("Divisors of " + num + ":");
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");

				if (i != num / i) {
					System.out.print(num / i + " ");
				}
			}
		}
	}
}
