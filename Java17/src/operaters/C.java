package operaters;

public class C implements A,B{

	@Override
	public void MethodB() {
		System.out.println("Method A from Interface A");
	}

	@Override
	public void MethodA() {
		System.out.println("Method B from Interface B");
	}

}
 class MultipleInheritance{
	public static void main(String[] args) {
		C c=new C();
		c.MethodA();
		c.MethodB();
	}
}
