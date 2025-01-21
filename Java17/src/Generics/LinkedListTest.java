package Generics;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> List = new LinkedList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		System.out.println("create linkedlist int:");
		List.display();
		System.out.println("Contains 2? " + List.contains(2));
		System.out.println("Contains 5? " + List.contains(5));
		System.out.println();
		System.out.println("Create a LinkedList of strings:");
		LinkedList<String> strList = new LinkedList<>();
		strList.add("kartik");
		strList.add("twinkle");
		strList.add("aman");
		strList.display();
		System.out.println("Contains 'kartik'? " + strList.contains("kartik"));
		System.out.println("Contains 'prince'? " + strList.contains("prince"));

	}
}
