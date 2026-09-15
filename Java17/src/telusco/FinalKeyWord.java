package telusco;

// final - variable , method, class
// final class Clac
//{
// public void show()
//{
//System.out.prinltn("in calc show");
//}
//	public void add(int a, int b)
//{
// System.out.println(a+b);
//
//}
//}
class Calc3 {
	public final void show() {
		System.out.println("By Navin");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}
}

class AdvCalc3 extends Calc3 {
	public void show1() {
		System.out.println("By John");

	}
}

public class FinalKeyWord {

	public static void main(String[] args) {
//    	final int num=8;
//    	num=9;
//    	System.out.println(num);

//    	Calc obj= new Calc();
//    	obj.show();
//    	obj.add(4, 5);

		AdvCalc3 obj = new AdvCalc3();
		obj.show();
		obj.add(4, 5);
	}

}
