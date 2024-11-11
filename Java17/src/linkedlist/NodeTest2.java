package linkedlist;

public class NodeTest2 {
	public static void main(String[] args) {
        LinkedList2 llist = new LinkedList2();
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        int length = llist.getLength();
        System.out.println(length); // Output: 5
    }
}
