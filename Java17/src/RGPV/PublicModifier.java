package RGPV;

class C1 {
	public int x = 5;
	protected int y = 10;
	int c = 10;
	private int a = 20;

	public void method() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(c);
		System.out.println(a);
	}
}

public class PublicModifier {
	public static void main(String[] args) {
		C1 c=new C1();
		c.method();
		
	}
}
