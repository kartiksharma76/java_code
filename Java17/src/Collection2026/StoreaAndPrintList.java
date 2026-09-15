package Collection2026;

import java.util.ArrayList;

public class StoreaAndPrintList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Aman");
		list.add("Kartik");
		list.add("Riya");

		for (String name : list) {
			System.out.println(name);
		}
	}
}
