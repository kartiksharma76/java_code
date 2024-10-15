package linkedlist;

public class DoublyLinkedListClint {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();

		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(50);
		dll.add(60);
//dll.deletelast(60);
//dll.addmid(2, 100);
		// dll.addFirst(80);
		// dll.addFirst(90);
		// dll.add(2,100);
		// dll.deleteall();

		dll.print();

//	System.out.println("***********reverse**********");
		// dll.printReverse();

	}
}