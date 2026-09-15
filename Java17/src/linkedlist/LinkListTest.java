package linkedlist;

public class LinkListTest {
	public static void main(String[] args) {
		LinkList list = new LinkList();

		list.insert(10);
		list.insert(20);
		list.insert(30);

		System.out.println("After insert:");
		list.print();

		list.addFirst(5);
		System.out.println("After addFirst:");
		list.print();

		list.addLast(40);
		System.out.println("After addLast:");
		list.print();

		list.addPosition(2, 15);
		System.out.println("After addPosition:");
		list.print();

		list.deleteByPosition(3);
		System.out.println("After deleteByPosition:");
		list.print();

		list.deleteFirst();
		System.out.println("After deleteFirst:");
		list.print();

		list.deleteLast();
		System.out.println("After deleteLast:");
		list.print();

		System.out.println("Middle Node: " + list.middleNode());

		System.out.println("Occurrence of 20: " + list.occurrence(20));

		System.out.println("Contains 30? " + list.contains(30));

		list.moveLastToFront();
		System.out.println("After moveLastToFront:");
		list.print();

		System.out.println("Size of list: " + list.size());
	}
}
