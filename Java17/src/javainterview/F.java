package javainterview;

public class F {
	public static void main(String[] args) {
		String a = "abhishek";
		String b = "abhishek";
		String c = new String("abhishek");
		String d = new String("abhishek");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(c == d);
		System.out.println(d == a);
	}
}
