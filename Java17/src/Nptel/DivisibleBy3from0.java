package Nptel;

import java.util.Scanner;

public class DivisibleBy3from0 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=0;i<n; i+=2) {
		if(i%3==0) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
}
