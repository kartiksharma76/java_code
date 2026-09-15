package array;

import java.util.ArrayList;

public class D21Array {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(2, 100);
		for (int element : list) {
			System.out.println(element);
		}
	}
}