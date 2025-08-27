package NPTL25;

import java.util.Scanner;

public class W04_P2 {
	static class Car {
		public int speed;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		Car c = new Car();
		c.speed = s;

		System.out.println("speed is:" + c.speed);

		sc.close();
	}
}
