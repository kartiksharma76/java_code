package linkedlist;

public class TraverseElementDoublyLinkedlistTest {
	public static void main(String[] args) {
		TraverseElementDoublyLinkedlist ll = new TraverseElementDoublyLinkedlist();
		ll.insert(34);
		ll.insert(22);
		ll.print();
		System.out.println();
		System.out.println("traverse element:");
		ll.traverese();
	}
}
