package linkedlist;

public class AddLastLinkedList {
private Node head;
private Node tail;
private int size;
public void add(int data) {
	Node node = new Node(data, null);
	node.next = head;
	head = node;
	size++;

}
public void addLast(int data) {
	Node node =new Node(data,null);
	if(head==null) {
		head=node;
		node=node.next;
		size++;
	}else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		temp.next=node;
	size++;
	}
}
public void print() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}

}
public int size(){
	return size;
	
}


class Node{
	private int data;
	private Node next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

}
}
