package linkedlist;

public class AllOperationLinkedlistTest {
	public static void main(String[] args) {
		AllOperationLinkedlist ll = new AllOperationLinkedlist();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(30);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(60);
		System.out.println("insert:");
		ll.print();
		int data = 30;
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
		System.out.println("removelast:");
		ll.deleteLast();
		ll.print();
		System.out.println();
		System.out.println("insert at position:");
		ll.addposition(1, 100);
		ll.print();
		System.out.println();
		System.out.println("delete first:");
		ll.deleteFirst();
		ll.print();
		System.out.println();
		System.out.println("addfirst:");
		ll.addFirst(90);
		ll.print();
		System.out.println();
		System.out.println("last to front:");
		ll.MoveLastToFront();
		ll.print();
		System.out.println();
		System.out.println("addlast:");
		ll.addLast(20);
		ll.print();
		System.out.println();
		System.out.println("size:" + ll.size());
		System.out.println("cheak value:" + ll.contains(100));
		System.out.println("cheak value:" + ll.contains(10));
		ll.print();

	}
}
