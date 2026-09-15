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
		byte b4=40;
		byte b5 =30;
		int b6=b4*b5;
		long w=30;
		int e=40;
	long m=w*e;
	float f1=30;
	double d1 =40;
	double h=f1*d1;
	int a11 =30;
	int a22=40;
	// without using third variable swape the value of a11 and a22
	// int a4=a5;
	// int a5=a4;
	a11=a11/a22;
	a22=a11*a22;
	System.out.println(a11);
	System.out.println(a22);
		
	}

}
