package telusco;
//class Computer
//{
//	
//}
//class Laptop extends Computer
//{
//	
//}
class A1{
	public void show() {
		System.out.println("in A show");
	}
}
class B2 extends A1{
	public void show() {
		System.out.println("in B show");
	}
}
class C2 extends A1{
	public void show() {
		System.out.println("in C show");
	}
}
class D{
	
}
public class DynamicMethod {
public static void main(String[] args) {
//	A1 obj = new B2();
//	obj.show();
	A1 obj=new A1();
	obj.show();
	
	obj=new B2();
	obj.show();
	
	obj=new C2();
	obj.show();
//	obj=new D();
	
//	Laptop obj1=new Laptop();
//	Computer obj1=new Laptop();
}
}
