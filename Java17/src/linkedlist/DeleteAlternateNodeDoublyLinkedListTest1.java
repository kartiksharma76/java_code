package linkedlist;

public class DeleteAlternateNodeDoublyLinkedListTest1 {
	public static void main(String[] args) {
		DeleteAlternateNodeDoublyLinkedlist1 ll = new DeleteAlternateNodeDoublyLinkedlist1();
		ll.insert(99);
		ll.insert(59);
		ll.insert(42);
		ll.insert(20);
		ll.print();
		System.out.println();
		System.out.println("deleteAlternateNode:");
		ll.deleteAlternateNodes();
		ll.print();
	}
}
