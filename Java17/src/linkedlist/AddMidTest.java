package linkedlist;

public class AddMidTest {
	public static void main(String[] args) {
		AddMid ll = new AddMid();
		ll.insert(10);
		ll.insert(20);
		ll.insert(40);
		ll.insert(50);
		ll.print();
		System.out.println();
		ll.addmid(3, 30);
		ll.print();
	}
}
