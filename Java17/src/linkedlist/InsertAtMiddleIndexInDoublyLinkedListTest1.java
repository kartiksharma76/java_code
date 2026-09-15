package linkedlist;

public class InsertAtMiddleIndexInDoublyLinkedListTest1 {
	public static void main(String[] args) {
		InsertAtMiddleIndexInDoublyLinkedList1 ll = new InsertAtMiddleIndexInDoublyLinkedList1();
		ll.insert(1);
		ll.insert(2);
		ll.insert(4);
		ll.print();
		System.out.println();
		System.out.println("insert at position :3:");
		ll.insertAtMid(3, 3);
		ll.print();
	}
}
