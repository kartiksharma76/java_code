package linkedlist;

public class AddLastLinkedListTest {
public static void main(String[] args) {
	AddLastLinkedList ll=new AddLastLinkedList();
	ll.add(50);
	ll.add(40);
	ll.add(30);
	ll.add(20);
	ll.add(10);
	ll.print();
	System.out.println();
	ll.addLast(60);
	ll.print();
}
}
