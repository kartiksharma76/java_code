package linkedlist;

public class AllOperationOfDoublyLinkedListTest {
	public static void main(String[] args) {
		AllOperationofDoublyLinkedList ll = new AllOperationofDoublyLinkedList();
		ll.insert(100);
		ll.insert(200);
		ll.insert(300);
		ll.insert(300);
		ll.insert(300);
		ll.insert(40);
		ll.insert(500);
		ll.insert(600);
		System.out.println("insert:");
		ll.print();
		int data = 300;
		System.out.println("count occurence:");
		int occurrences = ll.Occurence(data);
		System.out.println("The key " + data + " appears " + occurrences + " times.");
		System.out.println();
		System.out.println("delete by position:");
		ll.deleteByPosition(3);
		ll.print();
		System.out.println();
		System.out.println("find middle index:");
		System.out.println(ll.middleNode());
		System.out.println();
		System.out.println("delete last:");
		ll.deleteLast();
		ll.print();
		System.out.println();
		System.out.println("insert at position:");
		ll.addPosition(1, 700);
		ll.print();
		System.out.println();
		System.out.println("delete first:");
		ll.deleteFirst();
		ll.print();
		System.out.println();
		System.out.println("addfirst:");
		ll.addFirst(900);
		ll.print();
		System.out.println();
		System.out.println("last to front:");
		ll.MoveLastToFront();
		ll.print();
		System.out.println();
		System.out.println("addlast:");
		ll.addLast(200);
		ll.print();
		System.out.println();
		System.out.println("size:" + ll.size());
//		System.out.println("cheak value:" + ll.contain(1000));
		ll.print();

	}
}
