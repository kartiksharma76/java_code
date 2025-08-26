package NPTL25;

import java.util.Scanner;

public class W03_P3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	int count =0;
	if(num==0) {
		count=1;
	}else {
		while(num!=0) {
			num  =num/10;
			count++;
		}
	}
	System.out.println(count);
}
}
