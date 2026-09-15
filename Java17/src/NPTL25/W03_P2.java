package NPTL25;

import java.util.Scanner;

public class W03_P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i + " ");
			}
		}
	}
}
