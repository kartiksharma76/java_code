package Enum;

public class Demo1 {
	static int sum(int... nums) {
		int total = 0;

		for (int x : nums) {
			total += x;
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(10, 20, 30, 40));
	}
}
