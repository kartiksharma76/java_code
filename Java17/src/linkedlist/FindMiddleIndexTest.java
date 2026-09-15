package linkedlist;

public class FindMiddleIndexTest {
public static void main(String[] args) {
	linkedlist5 ll=new linkedlist5();
	ll.insert(1);
	ll.insert(5);
	ll.insert(7);
	ll.insert(6);
	ll.insert(4);
	ll.insert(2);
	
	System.out.println("middle Node of linkedlist is:" + ll.middleNode());
}
}
