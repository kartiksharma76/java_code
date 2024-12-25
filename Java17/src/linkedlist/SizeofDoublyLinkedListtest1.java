package linkedlist;

public class SizeofDoublyLinkedListtest1 {
	public static void main(String[] args) {
		SizeofDoublyLinkedList1 ll = new SizeofDoublyLinkedList1();
		ll.insert(2);
		ll.insert(4);
		ll.insert(6);
		ll.insert(7);
		ll.insert(5);
		ll.insert(1);
		ll.insert(0);
		ll.print();
		System.out.println();
		System.out.println("length of doublylinkedlist:" + ll.size());
	}
}
