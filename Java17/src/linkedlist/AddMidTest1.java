package linkedlist;

public class AddMidTest1 {
	public static void main(String[] args) {
		AddMid1 ll = new AddMid1();
		ll.insert(1);
		ll.insert(2);
		ll.insert(4);
		ll.print();
		System.out.println("insert data at position three:");
		ll.Adddata(3, 3);
		ll.print();
	}
}
