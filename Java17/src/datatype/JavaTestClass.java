package datatype;

public class JavaTestClass {
	public static void main(String[] args) {
		int number = 10;
		double doublenumber = number;
		System.out.println("doublevalue;" + doublenumber);

		int intnumber = (int) doublenumber;
		System.out.println("int value;" + intnumber);

		String str = String.valueOf(intnumber);
		System.out.println("string value;" + str);

		System.out.println(" add 2 in str;" + (str + 2));
		System.out.println(" add 2 in str;" + (Integer.parseInt(str) + 92));
	}
}
