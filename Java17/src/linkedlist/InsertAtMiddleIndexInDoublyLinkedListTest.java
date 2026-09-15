package linkedlist;

public class InsertAtMiddleIndexInDoublyLinkedListTest {
	public static void main(String[] args) {
		InsertAtMiddleIndexInDoublyLinkedList ll = new InsertAtMiddleIndexInDoublyLinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		System.out.println();
		System.out.println("insert at mid positio :30:");
		ll.insertAtMid(3, 30);
		ll.print();
	}
}
