package linkedlist;

public class AllOperationDoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	/**
	 * insert(int data): Purpose: Inserts a new node at the end (tail) of the list.
	 * Algorithm: Create a new node with the given data. If the list is empty (head
	 * == null), set both head and tail to the new node. If the list is not empty,
	 * link the new node to the tail, update the tail pointer to the new node, and
	 * update the previous pointer of the new node to the old tail. Increment the
	 * size of the list.
	 * 
	 * @param data
	 */
	public void insert(int data) {
		Node node = new Node(data, null, null);
		if (head == null) {
			head = node;
			tail = head;
			size++;
		} else {
			tail.next = node;
			node.previous = tail;
			tail = node;
			size++;
		}
	}

//add first 
	/**
	 * addFirst(int data): Purpose: Adds a new node at the beginning (head) of the
	 * list. Algorithm: Create a new node with the given data. Set the new node’s
	 * next pointer to the current head. Update the previous pointer of the current
	 * head (if it exists) to the new node. Set the head to the new node. Increment
	 * the size of the list.
	 * 
	 * @param data
	 */
	public void addFirst(int data) {
		Node node = new Node(data, null, null);
		node.next = head;
		head.previous = node;
		head = node;
		size++;
	}

	/**
	 * addPosition(int position, int data): Purpose: Adds a new node at a specific
	 * position in the list. Algorithm: Create a new node with the given data.
	 * Traverse the list to find the node just before the desired position (position
	 * - 1). Update the new node’s next pointer to point to the current node at the
	 * desired position. Update the previous pointer of the node at the desired
	 * position to point to the new node. Link the new node to the previous node by
	 * updating the previous node's next pointer to the new node. Increment the size
	 * of the list.
	 * 
	 * @param position
	 * @param data
	 */
	public void addPosition(int position, int data) {
		Node node = new Node(data, null, null);
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			if (temp != null) {
				temp = temp.next;
			}
		}

		node.next = temp.next;
		if (temp.next != null) {
			temp.next.previous = node;
		}
		temp.next = node;
		node.previous = temp;
	}

//add last 
	/**
	 * addLast(int data): Purpose: Adds a new node at the end (tail) of the list
	 * (same as insert). Algorithm: This method simply calls the insert(data) method
	 * to add the node at the end.
	 * 
	 * @param data
	 */
	public void addLast(int data) {
//		Node node = new Node(data, null, null);
//		tail.next = node;
//		node.previous = tail;
//		tail = node;
//		size++;
		insert(data);
	}

	/**
	 * size(): Purpose: Returns the number of nodes in the list. Algorithm: Simply
	 * returns the size variable that keeps track of the number of nodes in the
	 * list.
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * MoveLastToFront(): Purpose: Moves the last node of the list to the front
	 * (head). Algorithm: Identify the last node (tail). Traverse to the end of the
	 * list (ensure that temp.next == null). Update the tail to the second-to-last
	 * node. Set the new head to the old tail and adjust the next pointers
	 * accordingly.
	 */
	public void MoveLastToFront() {
		Node node = tail;
		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		node.next = head;
		head = node;
	}

	/**
	 * Occurrence(int data): Purpose: Counts how many times a specific value (data)
	 * occurs in the list. Algorithm: Traverse the list from head to tail. Increment
	 * the counter each time a node’s data matches the given data. Return the count.
	 * 
	 * @param data
	 * @return
	 */
	public int Occurence(int data) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		return count;

	}

	/**
	 * middleNode(): Purpose: Returns the data of the middle node of the list.
	 * Algorithm: Use two pointers: node and temp. Move node one step at a time and
	 * temp two steps at a time. When temp reaches the end of the list, node will be
	 * at the middle node. Return the data of the middle node.
	 * 
	 * @return
	 */
	public int middleNode() {
		Node node = head;
		Node temp = head;
		while (temp != null && temp.next != null) {
			node = node.next;
			temp = temp.next.next;
		}
		return node.data;
	}

//print
	/**
	 * print(): Purpose: Prints the data of all nodes from head to tail. Algorithm:
	 * Traverse the list from head to tail. Print the data of each node.
	 */
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

// reverse print
	/**
	 * printReverse(): Purpose: Prints the data of all nodes from tail to head.
	 * Algorithm: Start from tail and traverse backwards using the previous
	 * pointers. Print the data of each node.
	 */
	public void printReverse() {
		Node temp = tail;
		for (int i = 0; i < size; i++) {
			System.out.println(temp.data);
			temp = temp.previous;
		}
	}

// delete last
	/**
	 * deleteLast(): Purpose: Deletes the last node of the list. Algorithm: Traverse
	 * the list to find the last node (temp). Update the previous pointer of the
	 * second-to-last node to null. Set temp's next pointer to null to disconnect it
	 * from the list. Decrement the size of the list.
	 */
	public void deleteLast() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.previous.next = null;
		temp.previous = null;
		size--;
	}

	/**
	 * deleteFirst(): Purpose: Deletes the first node (head) of the list. Algorithm:
	 * Set head to the second node (head.next). Update the previous pointer of the
	 * new head to null. Decrement the size of the list.
	 */

	public void deleteFirst() {
		head = head.next;
		size++;
	}

	// add mid point
	/**
	 * addmid(int position, int data): Purpose: Adds a node at a specific position
	 * (similar to addPosition). Algorithm: Traverse to the node just before the
	 * desired position (position - 1). Insert the new node at the specified
	 * position by adjusting the next and previous pointers.
	 * 
	 * @param position
	 * @param data
	 */
	public void addmid(int position, int data) {
		Node node = new Node(data, null, null);
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;

		}

		node.next = temp;
		node.previous = temp.previous;
		temp.previous = node;
		temp.previous = node;
		size++;
	}

	/**
	 * deleteByPosition(int position): Purpose: Deletes a node at a specific
	 * position in the list. Algorithm: Traverse the list to the node just before
	 * the desired position. Update the next pointer of the node before the target
	 * node to point to the node after the target node. Update the previous pointer
	 * of the node after the target node to point to the node before the target
	 * node. Decrement the size of the list.
	 * 
	 * @param position
	 */
	public void deleteByPosition(int position) {
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		Node node = temp.next;
		temp.next = node.next;
		node.next.previous = temp;
	}

	/**
	 * contain(int data): Purpose: Checks if the list contains a specific value
	 * (data). Algorithm: Traverse the list from head to tail. If a node with the
	 * given data is found, return true. Otherwise, return false.
	 * 
	 * @param data
	 * @return
	 */
	public boolean contain(int data) {
		Node temp = head;
		while (temp != null) {
			if (data == temp.data) {
				return true;

			}
			temp = temp.next;
			temp.previous = temp.next;

		}
		return false;
	}

	/**
	 * deleteAlternateNodes(): Purpose: Deletes every alternate node in the list.
	 * Algorithm: Traverse the list and, for each node, skip the next node (i.e.,
	 * delete the node after the current node). Update the next pointer of the
	 * current node to point to the node after the skipped node. Continue until the
	 * end of the list.
	 */
	public void deleteAlternateNodes() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null && temp.next != null) {
			temp.next = temp.next.next;

			temp = temp.next;
		}

	}

	/**
	 * Purpose: Represents a node in the doubly linked list. Attributes: data:
	 * Stores the data of the node. previous: Points to the previous node in the
	 * list. next: Points to the next node in the list. Constructor: Initializes the
	 * data, previous, and next pointers.
	 * 
	 */
	class Node {
		private int data;
		private Node previous;
		private Node next;

		public Node(int data, Node previous, Node next) {
			super();
			this.data = data;
			this.previous = previous;
			this.next = next;
		}

	}
}