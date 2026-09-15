package NPTL25;

import java.util.Scanner;

public class W01_P4 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int x= sc.nextInt();
	int y= sc.nextInt();
	int quotient =x/y;
	int reminder = x%y;
	System.out.println("the quotient is :"+ quotient);
	System.out.println("the reminder is :"+reminder);
	sc.close();
}
}
