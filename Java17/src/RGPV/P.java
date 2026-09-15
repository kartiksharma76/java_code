package RGPV;

public interface P {
void m1();

}
 interface Q{
	void m2();
}
interface R{
	void m3();
	
}
class S implements P,Q,R{

	@Override
	public void m3() {
		System.out.println("kartik");
		
	}

	@Override
	public void m2() {
	System.out.println("aman");
		
	}

	@Override
	public void m1() {
	System.out.println("keertan");
	}
	
}