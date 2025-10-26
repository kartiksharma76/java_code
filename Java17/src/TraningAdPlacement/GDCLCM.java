package TraningAdPlacement;

import java.util.Scanner;

public class GDCLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gdc;
		int lcm;
		System.out.println("Enter Two Number :");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = a;
		int y = b;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		gdc = a;
		lcm = (x * y) / gdc;
		System.out.println("GDC =" + gdc + "LCM =" + lcm);

	}
}
