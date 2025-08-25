package NPTL25;

import java.util.Scanner;

public class W01_P2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	double radius= sc.nextDouble();
	double height =sc.nextDouble();
	
	double volume =Math.PI * radius * radius * height;
	
	System.out.printf("volume.is: %.2f",volume );
	sc.close();
}
}
