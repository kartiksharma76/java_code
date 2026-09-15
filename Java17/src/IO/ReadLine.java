package IO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadLine {
	public static void main(String[] args) {
		System.out.println("plz enter row count");
		Scanner sc=new Scanner(System.in);
		int rowCount = sc.nextInt();
		
//		while(sc.hasNext()) {
//			String nextLine = sc.nextLine();
//			System.out.println(nextLine);
//		}
		System.out.println("plz enter row values");
		Scanner sc1=new Scanner(System.in);
		List<String> list=new ArrayList<>();
		for(int i=0;i<rowCount;i++) {
			String nextLine = sc1.nextLine();
			list.add(nextLine);
		}
		System.out.println(list);
		
	}
}
