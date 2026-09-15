package linkedlist;

import linkedlist.CounterListNode.Node;

public class CountListNode {
	private Node head;
	private int size;
	private int length;

	public void insert(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;

	}

	public int length() {
		return size;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

	}
}
