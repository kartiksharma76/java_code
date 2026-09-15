package NPTL25;

import java.util.Scanner;

interface Number {
	int findsqr(int i);
	
}
class A implements Number{

	@Override
	public int findsqr(int i) {
		// TODO Auto-generated method stub
		return i*i;
	}
	
}
public class W05_P1 {
public static void main(String[] args) {
	A a= new A();
	Scanner sc =  new Scanner(System.in);
	int i =sc.nextInt();
	System.out.println(a.findsqr(i));
}
}
