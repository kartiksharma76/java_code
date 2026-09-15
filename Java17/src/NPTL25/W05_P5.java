package NPTL25;

import java.util.Scanner;

public class W05_P5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	int j;
	try {
		switch(i) {
		case 0:
			int zero= 0;
			j = 92/zero;
			break;
			
		case 1:
			int b[]=null;
			j= b[0];
			break;
			
			default :
				System.out.println("No exception");
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}		
}
}
