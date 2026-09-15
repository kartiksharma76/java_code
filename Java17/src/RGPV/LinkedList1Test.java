package RGPV;

public class LinkedList1Test {
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.print();
		System.out.println("add last:");
		list.addlast(50);
		list.print();
		System.out.println("add First:");
		list.addFirst(60);
		list.print();
		System.out.println("add position:");
		list.addPosition(4, 70);
		list.print();
		System.out.println("delete first:");
		list.deleteFirst();
		list.print();
		System.out.println("delete by position:");
		list.deleteByPosition(3);
		list.print();
		System.out.println("delete last:");
		list.deletelast();
		list.print();
	}
}
