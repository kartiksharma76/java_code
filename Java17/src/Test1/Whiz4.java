package Test1;

public class Whiz4 {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		if (value1 == value2)
			System.out.print("1");
		if (value1 != value2)
			System.out.print("2");
		if (value1 > value2)
			System.out.print(3);
		if (value1 < value2)
			System.out.print(4);
// Compilation fails due to an error at line 16	 
// if (value1 => value2)
		System.out.print("5");
	}
}
