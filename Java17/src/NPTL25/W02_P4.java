package NPTL25;

import java.util.Scanner;

public class W02_P4 {
	static class Rectangle{
		int length;
		int width;
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int l = sc.nextInt();
	int w= sc.nextInt();
	
	Rectangle rect = new Rectangle();
	rect.length=l;
	rect.width =w;
	
	int area = rect.length * rect.width;
	
	int sum = rect.length + rect.width;
	System.out.println("sum of length and width is :"+ sum);
	
	sc.close();
}
}
