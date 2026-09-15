package encapsulation;

public class VarArgument {
	public static void m1(int... a) {
		int sum = 0;
		for (int i : a) {
			sum = sum + i;

		}
		System.out.println(sum);
	}

	public void m1(String s, float f, int... a) {

	}

	public static void main(String[] args) {
		m1(10, 20, 30, 40, 50, 60, 70);
	}
}
