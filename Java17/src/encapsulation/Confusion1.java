package encapsulation;

public class Confusion1 {
	// int is winner compare to long,long is looser compare to int (W 1,L 1)
	
		public static void m1(int a, long b) {
			System.out.println("int,long");
		} 
		// long is looser compare to int,int  is winner compare to long (W 1,L 1)
//		public static void m1(long a, int b) {
//			System.out.println("long,int");
//		} 
		public static void main(String[] args) {
			m1(10,20); 
		}
}
