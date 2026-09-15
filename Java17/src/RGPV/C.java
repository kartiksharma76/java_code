package RGPV;

public class C implements A,B{

	@Override
	public void m2() {
		System.out.println("my name ke kartik");
		
	}

	@Override
	public void m1() {
		System.out.println(" roll no 0133ci231113");
		
	}
public static void main(String[] args) {
	C c =new C();
	c.m1();
	c.m2();
}
}
