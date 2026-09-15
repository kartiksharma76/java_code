package LinkedListProblems;

public class CalculateMid {
private Node head;
private Node tail;
private int size;

public void insert(int data) {
	Node node=new Node(data,null);
	if(head==null) {
		head=node;
		tail=head;
		size++;
	}else {
		tail.next=node;
		tail=node;
		size++;
	}
}
public int  midNode() {
	Node node=head;
	Node temp=head;
	while(temp!=null&& temp.next!=null) {
		node=node.next;
		temp=temp.next.next;
	}
	return node.data;
}
public void print() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
class Node{
	private int data;
	private Node next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}}
}