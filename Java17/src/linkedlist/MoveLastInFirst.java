package linkedlist;

public class MoveLastInFirst {
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

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void moveLastToFront() {
		Node node = tail;
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		node.next = head;
		head = node;
	}

	class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

}
