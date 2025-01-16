package queue;

public class AllQueueLinkedList {
private Node front;
private Node rear;
private int size;

public void insert(int data) {
	Node node =new Node(data,null);
	if(front==null) {
		front=node;
		rear=front;
	}
	else {
	rear.Next=node;
	rear=node;
	size++;
}
}
public int dequeue(int data) {
	Node node =new Node(data ,null);
	if(front==null) {
		System.out.println("underflow");
		return -1;
	}
	 data=front.data;
	 front=front.Next;
	 return data;
	
	
}
public void print () {
	Node temp=front;
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp=temp.Next;
	}
}

class Node{
	int data;
	Node Next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		Next = next;
	}
}
}
