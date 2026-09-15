package javainterview;
//static -> SIB-1-A
//-> main start -> Started
//-> B first time use hua -> class load hogi
//-> static block of B chalega -> SIB-1-B
//-> static ke andar jo block hai wo bhi yahi chalega -> IIB-1-B (ye actual IIB nahi hai)
//-> object creation -> constructor call -> B constructor
//-> method call -> Cheese Burger
//-> second object -> constructor call -> B constructor
//-> method call -> Cheese Burger
//-> main end -> ended
public class A {
	static {
		System.out.println("SIB-1-A");

	}

	public static void main(String[] args) {
		System.out.println("Started");
		B obj = new B();
		obj.burger();
		B obj2 = new B();
		obj.burger();
		System.out.println("ended");
	}
}

class B {
	B() {
		System.out.println("B constructor");

	}

	static {
		System.out.println("SIB-1-B");
		{
			System.out.println("IIB-1-B");
		}

	}

	static void burger() {
		System.out.println("Cheese Burger");
	}

}

// static -> SIB-1-A-> Started -> before run main -> main -> static first SIB -1-B -> static ke under ek aur so static me count hogi->
//->IIB-1-B -> constructor call hota hai -> b constructor -> uske baaad B ek static block hai ->cheese burger-> ended