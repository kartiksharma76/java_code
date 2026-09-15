package Generics;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.printData();
		System.out.println();
		list.delete();
		list.printData();
		System.out.println();
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("kartik");
		list1.add("kirtan");
		list1.add("kaushal");
		list1.printData();

	}
}
