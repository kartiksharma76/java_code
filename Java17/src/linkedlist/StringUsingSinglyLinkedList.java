package linkedlist;

public class StringUsingSinglyLinkedList {
	private Node head;
	private Node tail;
	private int size;

//1 inserting
	/**
	 * Create a new node with the given data. Set the new node's next to the current
	 * head. Update head to point to the new node. Increment the size.
	 **/

	public void insert(String data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;

	}

// 2 add mid position
	/**
	 * Traverse the list to the node just before the target position (position - 1).
	 * Create a new node with the given data. Set the new node's next to the next of
	 * the node at position - 1. Update the next of the node at position - 1 to
	 * point to the new node. Increment the size.
	 * 
	 */

	public void addmid(int position, String data) {
		Node node = new Node(data, null);
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
	}

//3.add last position
	/**
	 * If the list is empty (head == null), set head to the new node. Otherwise,
	 * traverse to the last node (temp.next == null). Set the next of the last node
	 * to the new node. Increment the size.
	 *
	 */

	public void addLast(String data) {
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

//4.delete position
	/**
	 * Traverse the list to the node just before the target position (position - 1).
	 * Update the next of this node to skip the target node (temp.next =
	 * temp.next.next). Decrement the size.
	 */

	public void deletebyposition(int position) {
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

// 5.delete first
	/**
	 * Update head to point to head.next. Decrement the size.
	 */

	public void deleteFirst() {
		head = head.next;
		size--;
	}

// 6. delete last
	/**
	 * traverse the list to the second-last node (size - 1). Set the next of the
	 * second-last node to null. Decrement the size.
	 */

	public void deleteLast() {
		Node temp = head;
		for (int i = 1; i < size - 1; i++) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
	}

//7. print the element
	/**
	 * tart from the head. Traverse the list and print the data of each node until
	 * reaching null
	 */

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

//8.add first

	/**
	 * Create a new node with the given data. Set the new node's next to the current
	 * head. Update head to point to the new node. Increment the size
	 *
	 */
	public void addFirst(String data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;
	}

// 9.add last using tail
	/**
	 * If the list is empty (head == null), set head and tail to the new node.
	 * Otherwise, set the next of the tail to the new node and update tail to the
	 * new node. Increment the size.
	 * 
	 */

	public void Addlastusingtail(String data) {
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

// 10.Check the  condition true and false are element in the list
	/**
	 * 
	 * Start from the head. Traverse the list, comparing the data of each node with
	 * the target value. If a match is found, return true. If traversal ends without
	 * a match, return false
	 */

	public boolean contains(String data) {
		Node temp = head;
		while (temp != null) {
			if (data == temp.data) {
				return true;
			}
			temp = temp.next;

		}
		return false;

	}

// 11. size print
	/**
	 * Return the value of the size variable.
	 */
	public int size() {
		return size;

	}

	/**
	 * prev (initially set to null): Tracks the previous node. current (initially
	 * set to head): Tracks the current node being processed. next (initially set to
	 * null): Temporarily stores the next node in the original list. Traverse the
	 * Linked List: While current is not null: Store the next node of current in
	 * next (next = current.next). Reverse the link by pointing current.next to
	 * prev. Move prev one step forward to current (prev = current). Move current
	 * one step forward to next (current = next). Update the Head: After the loop
	 * ends, prev will point to the new head of the reversed list. Update head to
	 * point to prev.
	 * 
	 * 
	 */

	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

// 13. create constructor
	/**
	 * he Node class defines the structure of a node in the linked list, which
	 * contains:
	 * 
	 * A data field to store the value. A next field to store a reference to the
	 * next node.
	 */

	class Node {
		String data;
		Node next;

		public Node(String data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}