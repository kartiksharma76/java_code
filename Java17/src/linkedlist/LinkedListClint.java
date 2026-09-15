package linkedlist;

public class LinkedListClint {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addLastUsingTail(10);
		list.addLastUsingTail(20);
		list.addLastUsingTail(30);
		list.addLastUsingTail(40);
		list.addLastUsingTail(50);
//		list.addFirst(70);
		list.addMid(4, 90);
		list.print();
		System.out.println();
		System.out.println(list.size());
	}
}


