package queue;

import linkedlist.SinglyLinkedList1;

public class ReversalQueue {
	private Node head;
	private Node tail;
	private int size;

	public void enqueue1(int data) {
		addFirst(data);
	}

	public int dequeue() {
		return deleleFirst();
	}

	public int size() {
		return size;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
	}

	public void addFirst(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;
	}

	private int deleleFirst() {
		int data = head.data;
		head = head.next;
		size--;
		return data;
	}

}

class Node {
	int data;
	Node next;

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
}
