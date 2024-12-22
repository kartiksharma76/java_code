package ExecutionOrder;

/**
 * loading 1.static member (parent to child) 2.instance member (parent to child)
 * 
 * calling(method calling) child to parent
 */
public class Child extends Parent {
	static {
		System.out.println("Child  static block 3");
	}
	{
		System.out.println("Child instance block3");
	}

	public int a = m1();
	public int b;
	public static int c;
	public static int d;

	public int m1() {

		System.out.println("Child  m1:" + a);
		return 10;

	}

//	public int m2() {
//		return 20;
//
//	}

	public static int m3() {
		System.out.println("Child m3:" + c);
		return 30;
	}

	public static int m4() {
		return 40;
	}

	{
		System.out.println("Child instance block 1 :" + a);

	}
	{
		System.out.println("Child instance block2:" + b);

	}
	static {
		System.out.println("Child static block 1 :" + c);
	}
	static {
		System.out.println("Child static block2:" + d);

	}

	public Child() {
		super();
		System.out.println("Child constructor");
	}

	public static void main(String[] args) {
		// Child child =new Child();
		// child.m8();
		// System.out.println(child.m2());
		// Parent parent =new Parent();
		// Dada dada=new Dada();
		Parent child = new Child();
		System.out.println(child.m2());

	}
}
