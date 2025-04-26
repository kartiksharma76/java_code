package Test1;

public class Whiz2 {
	public static void main(int[] i) {
		System.out.print("main1");
	}

	public static void main(String... c) {
		System.out.print("main2");
	}

	public static void main(String c) {
		System.out.print("main3");
	}
}
