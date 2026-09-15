package javabasics;

import java.util.Scanner;

public class ProtoTyping {
public static void main(String[] args) {
	int x,y ,sum;
	
	Scanner sc =new Scanner(System.in ) ;
	System.out.println("enter the first number");
	x=sc.nextInt();
	System.out.println("enter the second number");
	y=sc.nextInt();
	sum=sum(x,y);
		
	
System.out.println("the of two number x and y is:"+sum);
}

private static int sum(int a, int b) {
	int sum=a+b;
	return sum;
}
}
