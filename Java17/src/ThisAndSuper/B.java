package ThisAndSuper;

public class B extends A{
	public void m3() {
		System.out.println(" B m3()");
	}
public static void main(String[] args) {
	A a=new B();
	a.m1();
}
}
