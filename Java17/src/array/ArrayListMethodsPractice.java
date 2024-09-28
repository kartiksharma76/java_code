package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsPractice {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10, 20, 70));
		list1.addAll(list2);
		System.out.println(list1);
		list1.removeAll(list3);
		System.out.println(list1);
		list1.retainAll(list3);
		System.out.println(list1);
		list1.clear();
		list1.removeAll(list1);
		list1.clear();
		System.out.println(list1);
	}

}
