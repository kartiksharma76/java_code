package telusco;

public class Confusion2 {
	///float is winner compare to double,float is looser compare to long (W 1,L 1)
public static void m1(float a, float b) {
	System.out.println("float,float");
	
}
// double is looser compare to float,long is winner compare to float(W1,L1)
//public static void m1(double a, long b) {
//	System.out.println("double ,long");
//}
public static void main(String[] args) {
	m1(10, 20);
}
}
