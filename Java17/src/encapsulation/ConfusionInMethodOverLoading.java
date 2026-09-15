package encapsulation;

/**
 * keep in mind method arguments sequence
 * 
 * 
 */
public class ConfusionInMethodOverLoading {
// int is winner compare to long,long is looser compare to int (W 1,L 1)

	public static void m1(int a, long b) {
		System.out.println("int,long");
	}
	// long is looser compare to int,int is winner compare to long (W 1,L 1)
//	public static void m1(long a, int b) {
//		System.out.println("long,int");
//	} 
//	
//public static void m1(long a, float b) {
//	System.out.println("long,float");
//   }
//	
//	public static void m1(long a, long b) {
//		System.out.println("long,long");
//	}
	// float is winner compare to double,float is looser compare to long (W 1,L 1)

//	public static void m1(float a, float b) {
//		System.out.println("float,float");
// 	}
//	public static void m1(double a, double b) {
//		System.out.println("double,double");
//	}

	// double is looser compare to float,long is winner compare to float (W 1,L 1)
//	public static void m1(double a, long b) {
//		System.out.println("double,long");
//	}

	public static void main(String[] args) {
		m1(10, 20);

	}

}
