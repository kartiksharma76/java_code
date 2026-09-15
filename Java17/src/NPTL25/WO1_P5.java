package NPTL25;

//import java.awt.peer.LightweightPeer;
import java.util.Scanner;

public class WO1_P5 {
public static void main(String[] args) {
	double width ;
	double hight;
	Scanner sc =new Scanner(System.in);
	width =sc.nextDouble();
	hight= sc.nextDouble();
	double perimeter = 2*(width + hight);
	double area = width * hight;
	
	System.out.printf("perimeter is 2*(%.if + %.if)= %.2f\n",hight,width,perimeter);
	System.out.printf("area is %.if * %.if - %.2f",width,hight,area);
sc.close();
}
}
