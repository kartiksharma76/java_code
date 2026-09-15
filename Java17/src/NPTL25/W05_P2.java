package NPTL25;

import java.util.Scanner;
 interface GCD {
public int findGCD(int n1,int n2);
}
class B implements GCD{

	@Override
	public int findGCD(int n1, int n2) {
		if(n1<0 || n2<0) {
			return-1;
		}
		if(n1==0 && n2==0) {
return 0;
		}
		else if( n2==0) {
			return n1;
			
		}else {
			return findGCD(n2, n1%n2);
		}
		
	}
	
}
public class W05_P2 {
public static void main(String[] args) {
	B a= new B();
	Scanner sc = new Scanner(System.in);
	int p1= sc.nextInt();
	int p2= sc.nextInt();
	System.out.println(a.findGCD(p1, p2));
}
}
