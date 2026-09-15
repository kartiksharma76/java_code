package linkedlist;

public class AlternateNode {
	private Node head;
	private int size;

	public void insert(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		size++;

	}

	public void deleteFirst() {
		head = head.next;
		size++;

	}

	public void deleteLast() {
		Node temp = head;
		for (int i = 1; i < size - 1; i++) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
	}

	public void deleteAlternateNode() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null && temp.next != null) {
			Node next = temp.next;
			temp.next = next.next;
			temp = temp.next;
		}

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;

			class Node {
				private int data;
				private Node next;

				public Node(int data, Node next) {
					this.data = data;
					this.next = next;
				}

			}
		}
	}
}
