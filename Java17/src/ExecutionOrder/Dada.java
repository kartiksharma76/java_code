package ExecutionOrder;

public class Dada {
	static {
		System.out.println(" Dada static block 3");
	}
	{
		System.out.println("Dada  instance block3");
	}

	public int a = m8();
	public int b;
	public static int c = m4();
	public static int d;

	public int m8() {

		System.out.println("Dada m8:" + a);
		return 10;

	}

	public int m2() {
		return 100;

	}

	public static int m3() {
		System.out.println("Dada m3:" + c);
		return 30;
	}

	public static int m4() {
		System.out.println("Dada m4() " + c);
		return 40;
	}

	{
		System.out.println("Dada instance block 1 :" + a);

	}
	{
		System.out.println("Dada instance block2:" + b);

	}
	static {
		System.out.println("Dada static block 1 :" + c);
	}
	static {
		System.out.println("Dada static block2:" + d);

	}

	public Dada() {
		super();
		System.out.println("Dada constructor");
	}
}
