package Polymorphism;

// left side of instanceof operator must be reference variable and. 
// right side might be same type or parent type then it will give True else False.
public class InstanceOfExample {
	public static void main(String[] args) {
		// Bank b=new SBI();
		B b = new B();
		if (b instanceof A) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}
}
