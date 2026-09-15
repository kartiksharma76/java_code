package NPTL25;

import java.util.Scanner;

public class W02_P1 {
public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int length= sc.nextInt();
	 int width = sc.nextInt();
	 int area =length * width ;
	 
	 System.out.println("Area is :"+ area);
	 sc.close();
}
}
