package Generics;

public class LinkedList<T> {
	private Node<T> head;

	public void add(T data) {
		Node<T> node = new Node<>(data, null);
		if (head == null) {
			head = node;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	public boolean contains(T data) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.data.equals(data)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	class Node<T> {
		T data;
		Node<T> next;

		public Node(T data, Node<T> next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}