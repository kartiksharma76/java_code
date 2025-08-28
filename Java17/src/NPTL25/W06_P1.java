package NPTL25;

import java.util.Scanner;

public class W06_P1 {
public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int num1 = sc.nextInt();
	 int num2 = sc.nextInt();
	 try {
		System.out.println(num1/num2);
	} catch (ArithmeticException e) {
		System.out.println("cannot divide by Zero");
	}
	 sc.close();
}
}
