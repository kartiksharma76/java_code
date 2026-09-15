package LinkedListProblems;

public class InsertValueAtMiddleTest {
	public static void main(String[] args) {
		InsertValueAtMiddle ll = new InsertValueAtMiddle();
		ll.insert(1);
		ll.insert(2);
		ll.insert(4);
		ll.display();
		System.out.println("InsertAtMiddle-");
		ll.addMid(3, 3);
		ll.display();

	}
}
