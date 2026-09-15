package NPTL25;

import java.util.Scanner;

public class W06_P3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2= sc.nextInt();
	try {
		int result = num1/num2;
		System.out.println("divide successful");
		System.out.println("Result is:"+ result);
	} catch (ArithmeticException e) {
		System.out.println("can not divide by zero");
	}catch (Exception e) {
		System.out.println("An unexcepted error occured ");
	}
	sc.close();
}
}
