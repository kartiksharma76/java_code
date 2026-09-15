package linkedlist;

public class DeleteByPositionTest {
	public static void main(String[] args) {
		DeleteBYPosition ll = new DeleteBYPosition();
		ll.insert(5);
		ll.insert(4);
		ll.insert(2);
		ll.insert(2);
		ll.print();
		System.out.println();
		ll.deletebyposition(1);
		ll.print();
		
	}
}
