package NPTL25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class W05_P4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int length =  sc.nextInt();
	int[]name = new int[length];
	int sum =0;
	
	try {
		for(int i=0; i<length;i++) {
			name[i]= sc.nextInt();
			sum +=name[i];
		}
		System.out.println(sum);
	} catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("you entered bad data.");
		
	}
}
}
