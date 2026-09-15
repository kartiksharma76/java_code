package NPTL25;

import java.util.Scanner;

public class W06_P5 {
public static double calculateSquareRoot(double num) throws Exception {
	
	if(num <0) {
		throw new Exception("Negative number");
	}
	return Math.sqrt(num);
	
}

public static void main(String[] args) {
	Scanner sc = new Scanner( System.in);
	double number =sc.nextDouble();
	try {
		double result =calculateSquareRoot(number);
		System.out.println("Square root is :"+ result);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("can not calculate sqaue root of negative number");
	}
	sc.close();
}
}
