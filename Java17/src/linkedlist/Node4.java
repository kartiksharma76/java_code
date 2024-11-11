package linkedlist;

public class Node4 {
	int data;
    Node next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList4{
	Node head;
	
	public void push (int data) {
		Node node =new Node (data);
		node.next =head;
		head=node;
		
	}
	int MiddleNode() {
		Node slowPtr=head;
		Node fastPtr=head;
		
		while(fastPtr!=null&&fastPtr!=null) {
			slowPtr=slowPtr.next ;
			fastPtr=fastPtr.next .next .next ;
			
		}
		return slowPtr.data ;
	}
}
