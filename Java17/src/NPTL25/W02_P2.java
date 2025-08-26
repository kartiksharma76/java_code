package NPTL25;

import java.util.Scanner;

public class W02_P2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int length= sc.nextInt();
	int width = sc.nextInt();
	
	int perimeter = 2*(length + width);
	System.out.println("perimeter :"+ perimeter);
	sc.close();
}
}
