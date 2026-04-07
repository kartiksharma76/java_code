package javainterview;

public class Armstrong {
	public static void main(String[] args) {
		int n = 153, sum = 0, temp = n;
		while (n > 0) {
			int r = n % 10;
			sum = r * r * r;
			n /= 10;
		}
		if (sum == temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}
