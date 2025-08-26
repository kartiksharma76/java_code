package NPTL25;

import java.util.Scanner;

public class W02_P5 {
	static class Circle {
		int radius;
		
		 Circle(int radius) {
		this.radius=radius;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r= sc.nextInt();
		Circle c =new Circle(r);
		System.out.println("Radius in the circle is :"+ c.radius);
		sc.close();
	}
}