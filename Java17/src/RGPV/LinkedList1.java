package RGPV;

import java.util.Iterator;

public class LinkedList1 {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = head;
			size++;
		} else {
			tail.next = node;
			tail = node;
			size++;
		}
	}

	public void addlast(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			size++;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}

	}

	public void addFirst(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void addPosition(int position, int data) {
		Node node = new Node(data, null);
		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
	}

	public void deleteFirst() {
		head = head.next;
		size--;
	}

	public void deleteByPosition( int position) {
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
public void deletelast() {
	Node temp=head;
	while(temp.next.next!=null) {
		temp=temp.next;
		
	}
	temp.next=null;
	tail=temp;
	size--;
}
class Node {
		private Node next;
		private int data;

		public Node(int data, Node next) {
			super();
			this.next = next;
			this.data = data;
		}
	}
}