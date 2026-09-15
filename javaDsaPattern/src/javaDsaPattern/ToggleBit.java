package javaDsaPattern;

//Toggle ith Bit

public class ToggleBit {

	public static int toggleBit(int n, int i) {

		return n ^ (1 << i);
	}

	public static void main(String[] args) {

		int n = 10;
		int i = 1;

		System.out.println("Result = " + toggleBit(n, i));
	}
}