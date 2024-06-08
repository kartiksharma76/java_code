package operaters;

//+ - * / modulas(%)
// max(int,type of b1,type of b2)=> max(int,byte,byte)
public class ArthematicOperater {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2;
		long a = 10;
		int b = 20;
		long c = a + b;
		float f = 10;
		double d = 20;
		double g = f + d;
		int a1 = 10;
		int a2 = 20;
		// without using third varable swape the values of a1 and a2
		// int a3 =a1;
		// a1=a2;
		// a2=a3;
		a2 = a2 - a1;
		a1 = a2 + a1;
		System.out.println(a1);
		System.out.println(a2);

	}

}
