package encapsulation;

public class VarArgument1 {
	public static void a(int... a) {
		int sub = 0;
		for (int i : a) {
			sub = sub - i;

		}
		System.out.println(sub);
	}

	public static void a(String s, float f, int... a) {

	}

	public static void main(String[] args) {
		a(20, 30, 40, 50, 60, 70);
	}
}
