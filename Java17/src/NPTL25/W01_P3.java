package NPTL25;

import java.util.Scanner;

public class W01_P3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		
		for(int i=0;i<=4; i++) {
			System.out.println(number +"x" + i + "="+(number *i));
		}
		sc.close();
	}
	
}
