package linkedlist;

public class CSLinkedListClint {
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.add(10);
		cll.add(20);
		cll.add(30);
//		cll.print();
		cll.print2();
		System.out.println(cll.isCircularLinkedList());
	}
}
