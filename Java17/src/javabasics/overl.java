package javabasics;

public class overl {
	public static void main(String[] args) {
		print(34, 38);
		print(23, 49, 79);
		print(37, 45, 56, 68);
	}

	public static void print(int i, int j, int k, int l) {
		int z = (i + j + k + l) / 2;

	}

	public static void print(int i, int j, int k) {
		int z = (i + j + k) / 2;

	}

	public static void print(int i, int j) {
		int z = (i + j) / 2;
		System.out.println("average of a,b,c&d=" + z);
		System.out.println("average of a&b=" + z);
		System.out.println("average of a,b&c=" + z);

	}
}
