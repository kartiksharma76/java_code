package operaters;

public class NarrowExplict {
	public static void main(String[] args) {
		double d = 100.04;
		long l = (long) d;
		int i = (int) l;
		float f = (float) i;

		System.out.println("double:" + d);
		System.out.println("long:" + l);
		System.out.println("int:" + i);
		System.out.println("float:" + f);

	}
}
