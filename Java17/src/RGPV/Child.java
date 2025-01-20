package RGPV;

public class Child extends Parent implements D, E {

	@Override
	public void E1() {
		System.out.println("i am anshu");

	}

	@Override
	public void d1() {
		System.out.println(" i am preeti");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.d1();
		c.E1();
		c.A();
	}

}
