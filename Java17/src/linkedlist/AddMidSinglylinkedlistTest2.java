package linkedlist;

public class AddMidSinglylinkedlistTest2 {
	public static void main(String[] args) {
		AddMidSinglylinkedlist ll = new AddMidSinglylinkedlist();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(60);
		ll.print();
		System.out.println();
		ll.addMid(3, 70);
		ll.print();
	}
}
