package array;

public class TestCLL {
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();

		list.insert(10);
		list.insert(20);
		list.insert(30);

		list.print();

		list.addFirst(5);
		list.print();

		list.addPosition(2, 15);
		list.print();

		list.deleteFirst();
		list.print();

		list.deleteLast();
		list.print();

		list.deletePosition(1);
		list.print();

		System.out.println("Size: " + list.size());
	}
}
