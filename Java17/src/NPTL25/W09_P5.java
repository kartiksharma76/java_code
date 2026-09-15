package NPTL25;

import java.util.Scanner;

class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point p) {
		double dx= this.x -p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
		
	}
}
public class W09_P5 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	 double x1 = sc.nextDouble();
     double y1 = sc.nextDouble();
     double x2 = sc.nextDouble();
     double y2 = sc.nextDouble();
     sc.close();
     
     Point p1 = new Point(x1, y1);
     Point p2 = new Point(x2, y2);

     System.out.print(p1.distance(p2));

}
}
