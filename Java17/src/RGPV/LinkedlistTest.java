package RGPV;

public class LinkedlistTest {
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.print();
		System.out.println();
		System.out.println("add first:");
		ll.addFirst(50);
		ll.print();
		System.out.println();
		System.out.println("add last:");
		ll.addLast(60);
		ll.print();
		System.out.println();
		System.out.println("addmid:");
		ll.position(70, 3);
		ll.print();
		System.out.println();
		System.out.println("boolean");
		System.out.println(ll.contain(90));
		ll.print();
		System.out.println();
		System.out.println("delete by position:");
		ll.deleteByPosition(5);
		ll.print();
		System.out.println();
		System.out.println("delete last:");
		ll.deleteFirst();
		ll.print();
		System.out.println();
		System.out.println("delete last:");
		ll.deleteLast();
		ll.print();
		System.out.println("size:");
		System.out.println(ll.size());
		int data = 30;
		System.out.println("count occurence:");
		int occurrences = ll.Occurence(data);
		System.out.println("The key " + data + " appears " + occurrences + " times.");
	}
}
