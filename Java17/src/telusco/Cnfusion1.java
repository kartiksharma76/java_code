package telusco;

public class Cnfusion1 {
// int is winner compare to long  is looser compare to int(w1,L1)
public static void m1(int a, long b) {
	System.out.println("int,long");
}
// long is looser compare to int, int is winner compare to long (w1,L1)
// public static void m1(long l, int b){
// System.out.println("long,int");
public static void main(String[] args) {
	m1(10,20);
}
}
