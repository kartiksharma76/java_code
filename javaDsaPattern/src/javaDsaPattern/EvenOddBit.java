package javaDsaPattern;

public class EvenOddBit {
	public static void main(String[] args) {
		int n = 7;
		if ((n & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
