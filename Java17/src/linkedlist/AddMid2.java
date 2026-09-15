package linkedlist;

import linkedlist.AddMid1.Node;

public class AddMid2 {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = head;
			size++;
		}
		tail.next = node;
		tail = node;
		size++;

	}

	public void Addmid(int position, int data) {
		Node node = new Node(data, null);
		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
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
}