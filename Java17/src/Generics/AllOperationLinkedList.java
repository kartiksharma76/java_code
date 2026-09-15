package Generics;

public class AllOperationLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	/**
	 * Insert (Tail Insertion) Algorithm:
	 * 
	 * Create a new node with the given data. If the list is empty (head == null):
	 * Set head and tail to the new node. Otherwise: Set tail.next to the new node.
	 * Update tail to the new node. Increment the size. Time Complexity: O(1)
	 * 
	 * @param data
	 */
	public void insert(T data) {
		Node<T> node = new Node<>(data, null);
		if (head == null) {
			head = node;
			tail = head;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	/**
	 * Add First (Head Insertion) Algorithm:
	 * 
	 * Create a new node with the given data. Set node.next to head. Update head to
	 * the new node. Increment the size. Time Complexity: O(1)
	 * 
	 * @param data
	 */
	public void addFirst(T data) {
		Node<T> node = new Node<>(data, null);
		node.next = head;
		head = node;
		size++;
	}

	/**
	 * . Add Last (Tail Insertion with Traversal) Algorithm:
	 * 
	 * Create a new node with the given data. If the list is empty: Set head to the
	 * new node. Otherwise: Traverse the list to the last node. Set the last node's
	 * next to the new node. Increment the size. Time Complexity:
	 * 
	 * Best Case (Empty List): O(1) Worst Case: O(n)
	 * 
	 * @param data
	 */
	public void addLast(T data) {
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
		size++;
	}

	/**
	 * Add at Position Algorithm:
	 * 
	 * Validate the position (not implemented but recommended). Create a new node
	 * with the given data. Traverse the list to the node just before the specified
	 * position. Set node.next to temp.next. Update temp.next to the new node.
	 * Increment the size. Time Complexity: O(n)
	 * 
	 * @param position
	 * @param data
	 */
	public void addPosition(int position, T data) {
		Node<T> node = new Node<>(data, null);
		Node<T> temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
	}

	/**
	 * Delete by Position Algorithm:
	 * 
	 * Validate the position (not implemented but recommended). Traverse the list to
	 * the node just before the specified position. Update temp.next to skip the
	 * node at the specified position (temp.next = temp.next.next). Decrement the
	 * size. Time Complexity: O(n)
	 * 
	 * @param position
	 */
	public void deleteByPosition(int position) {
		Node<T> temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
	}

	/**
	 * Find Middle Node Algorithm:
	 * 
	 * Use two pointers: node (moves one step) and temp (moves two steps). Traverse
	 * the list until temp or temp.next is null. Return node.data. Time Complexity:
	 * O(n)
	 * 
	 * @return
	 */
	public T middleNode() {
		Node<T> node = head;
		Node<T> temp = head;
		while (temp != null && temp.next != null) {
			node = node.next;
			temp = temp.next.next;
		}
		return node.data;
	}

	/**
	 * . Occurrence Count Algorithm:
	 * 
	 * Initialize a counter to 0. Traverse the list. For each node, check if
	 * node.data.equals(data). If true, increment the counter. Return the counter.
	 * Time Complexity: O(n)
	 * 
	 * 
	 * @param data
	 * @return
	 */
	public int occurrence(T data) {
		int count = 0;
		Node<T> temp = head;
		while (temp != null) {
			if (temp.data.equals(data)) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}

	/**
	 * Delete First Algorithm:
	 * 
	 * If the list is not empty: Update head to head.next. Decrement the size. Time
	 * Complexity: O(1)
	 */
	public void deleteFirst() {
		if (head != null) {
			head = head.next;
			size--;
		}
	}

	/**
	 * Delete First Algorithm:
	 * 
	 * If the list is not empty: Update head to head.next. Decrement the size. Time
	 * Complexity: O(1)
	 * 
	 * 9. Delete Last Algorithm:
	 * 
	 * If the list is empty or has one node: Set head and tail to null. Otherwise:
	 * Traverse to the second-last node. Set temp.next to null. Update tail to the
	 * second-last node. Decrement the size. Time Complexity: O(n)
	 */
	public void deleteLast() {
		if (head == null || head.next == null) {
			head = null;
			tail = null;
			size--;
			return;
		}
		Node<T> temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
	}

	/**
	 * Move Last to Front Algorithm:
	 * 
	 * If the list has fewer than two nodes, return. Traverse to the second-last
	 * node. Update tail to the second-last node and set tail.next to null. Link the
	 * last node to the current head. Update head to point to the last node. Time
	 * Complexity: O(n)
	 */
	public void moveLastToFront() {
		if (head == null || head.next == null)
			return;

		Node<T> temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node<T> last = temp.next;
		temp.next = null;
		tail = temp;

		last.next = head;
		head = last;
	}

	/**
	 * Size Algorithm:
	 * 
	 * Return the size variable. Time Complexity: O(1)
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * Contains Algorithm:
	 * 
	 * Traverse the list. For each node, check if node.data.equals(data). If found,
	 * return true. If the loop ends, return false. Time Complexity: O(n
	 * 
	 * @param data
	 * @return
	 */
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

	/**
	 * Print Algorithm:
	 * 
	 * Traverse the list. Print node.data for each node. Time Complexity: O(n)
	 */
	public void print() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * Constructor Algorithm:
	 * 
	 * Accept two parameters: data: The value to be stored in the node. next: A
	 * reference to the next node (or null if this is the last node). Assign data to
	 * the node's data field. Assign next to the node's next field.
	 * 
	 * @param <T>
	 */
	public class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}
}
