package linkedlist;

public class AllOperationLinkedlist {
	private Node head;
	private Node tail;
	private int size;

	/**
	 * insert(int data) Algorithm:
	 * 
	 * Create a new node with the given data. If the list is empty (head == null):
	 * Set head and tail to the new node. Increment size. Else: Add the new node at
	 * the end by setting tail.next to the new node. Update tail to the new node.
	 * Increment size. Time Complexity:
	 * 
	 * Best case (empty list): O ( 1 ) O(1) Worst case: O ( 1 ) O(1)
	 * 
	 * @param data
	 */
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

	/**
	 * addFirst(int data) Algorithm:
	 * 
	 * Create a new node with the given data. Set node.next to head. Update head to
	 * point to the new node. Increment size. Time Complexity: O( 1 ) O(1)
	 * 
	 * @param data
	 */
	public void addFirst(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;
	}

	/**
	 * addLast(int data) Algorithm:
	 * 
	 * Create a new node with the given data. If the list is empty: Set head to the
	 * new node. Increment size. Else: Traverse to the end of the list using a
	 * temporary pointer. Set the last node's next to the new node. Increment size.
	 * Time Complexity:
	 * 
	 * Best case (empty list): O ( 1 ) O(1) Worst case: O ( n )
	 * 
	 * @param data
	 */
	public void addLast(int data) {
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

	/**
	 * addPosition(int position, int data) Algorithm:
	 * 
	 * Validate the position (not implemented in the code but recommended). Create a
	 * new node with the given data. Traverse to the node just before the specified
	 * position using a loop. Set node.next to temp.next (link new node to the next
	 * node). Update temp.next to point to the new node. Increment size. Time
	 * Complexity: O ( n ) O(n)
	 * 
	 */
	public void addposition(int position, int data) {
		Node node = new Node(data, null);
		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;

		}
		node.next = temp.next;
		temp.next = node;
		size++;

	}

	/**
	 * deleteByPosition(int position) Algorithm:
	 * 
	 * Validate the position (not implemented in the code but recommended). Traverse
	 * to the node just before the specified position using a loop. Update temp.next
	 * to skip the node at position (temp.next = temp.next.next). Adjust the tail
	 * pointer if the last node is deleted. Decrement size. Time Complexity: O ( n )
	 * O(n)
	 * 
	 * @param position
	 */
	public void deleteByPosition(int position) {
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;

		}
		temp.next = temp.next.next;
	}

	/**
	 * middleNode() Algorithm:
	 * 
	 * Use two pointers, node and temp. Move node one step at a time and temp two
	 * steps at a time. When temp reaches the end, node will be at the middle.
	 * Return node.data. Time Complexity: O( n ) O(n)
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

	/**
	 * Occurence(int data) Algorithm:
	 * 
	 * Initialize a counter to 0. Traverse the list using a temporary pointer. For
	 * each node, check if node.data == data. Increment the counter if the condition
	 * is true. Return the counter. Time Complexity: O ( n ) O(n)
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
	 * deleteFirst() Algorithm:
	 * 
	 * Check if the list is empty (not implemented in the code but recommended).
	 * Update head to point to head.next. Decrement size. Time Complexity: O ( 1 )
	 * O(1)
	 */
	public void deleteFirst() {
		head = head.next;
		size++;
	}

	/**
	 * deleteLast() Algorithm:
	 * 
	 * Check if the list is empty (not implemented in the code but recommended).
	 * Traverse to the second-last node using a loop. Set the second-last node's
	 * next to null. Update tail to the second-last node. Decrement size. Time
	 * Complexity: O ( O ) O(n)
	 */
	public void deleteLast() {
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
	}

	/**
	 * MoveLastToFront() Algorithm:
	 * 
	 * Check if the list has fewer than two nodes (not implemented in the code but
	 * recommended). Traverse to the second-last node. Update tail to the
	 * second-last node and set tail.next to null. Link the last node to the current
	 * head. Update head to point to the last node. Time Complexity: o ( n) O(n)
	 */
	public void MoveLastToFront() {
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

	/**
	 * size() Algorithm:
	 * 
	 * Return the size variable. Time Complexity: O( 1 ) O(1
	 * 
	 * @return
	 */
	public int size() {
		return size;

	}

	/**
	 * contains(int data) Algorithm:
	 * 
	 * Traverse the list using a temporary pointer. For each node, check if
	 * node.data == data. If found, return true. If the loop ends without finding
	 * the data, return false. Time Complexity: O ( n ) O(n)
	 * 
	 * 
	 * @param data
	 * @return
	 */
	public boolean contains(int data) {
		Node temp = head;
		while (temp != null) {
			if (data == temp.data) {
				return true;
			}
			temp = temp.next;

		}
		return false;

	}

	/**
	 * print() Algorithm:
	 * 
	 * Traverse the list using a temporary pointer. Print node.data for each node.
	 * Time Complexity: O ( n ) O(n)
	 */
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * Attributes:
	 * 
	 * data: This stores the value of the node, which is of type int. next: This is
	 * a reference to the next node in the list (or null if there is no next node).
	 * Constructor:
	 * 
	 * The constructor initializes the data and next attributes. data is assigned
	 * the value passed as a parameter, and next is assigned the node reference
	 * passed as a parameter (or null if it's the last node).
	 */
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