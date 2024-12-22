package ExecutionOrder;

public class Parent extends Dada {
	static {
		System.out.println(" Parent static block 3");
	}
	{
		System.out.println(" Parent instance block3");
	}

	public int a = m9();
	public int b;
	public static int c;
	public static int d;

	public int m9() {

		System.out.println(" Parent m9:" + a);
		return 10;

	}

	public int m2() {
		return 50;

	}

	public static int m3() {
		System.out.println(" Parent m3:" + c);
		return 30;
	}

	public static int m4() {
		return 40;
	}

	{
		System.out.println(" Parent instance block 1 :" + a);

	}
	{
		System.out.println("Parent instance block2:" + b);

	}
	static {
		System.out.println("Parent static block 1 :" + c);
	}
	static {
		System.out.println("Parent static block2:" + d);

	}

	public Parent() {
		super();
		System.out.println("Parent constructor");
	}
}
