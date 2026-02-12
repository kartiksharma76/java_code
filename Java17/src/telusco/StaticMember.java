package telusco;

class P {
	private int x;
	private static int y;

	void fun1() {
		y = 22;
		x = 5;
	}

	void fun2() {
		System.out.println(x);
	}

	void fun3() {
		y = 45;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		P a1 = new P();
		P a2 = new P();
		a1.fun1();
		a2.fun2();
	}
}
