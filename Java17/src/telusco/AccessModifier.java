package telusco;

public class AccessModifier {
	int marks = 6;

//protected marks = 6;
	public void show() {

	}
}

class B1 {
	// private int marks;
	int marks;
}

class C1 extends A {
	public void abc() {
		// System.out.println(marks);
	}
}
//public class Demo{
//	public static void main(String[] args) {
//   
//	A obj=new A();
//	System.out.println(obj.marks);
//	obj.show();
//	
//	B obj1=new B();
//	System.out.println(obj.marks);
//	
//	}
//}