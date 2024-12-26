package linkedlist;

public class PrintRevareseDoublyLinkdedListTest {
	public static void main(String[] args) {
		PrintRevareseDoublyLinkdedList ll = new PrintRevareseDoublyLinkdedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.print();
		System.out.println();
		System.out.print("traverse element:");
		ll.traverese();
	}
}
