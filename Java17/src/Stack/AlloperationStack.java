package Stack;

public class AlloperationStack {
	private Node top;
	private int size;
	private Node peek;

	/**
	 * push(int data) Algorithm: Adds a new element to the end of the list. If the
	 * list is empty (top == null), set the new node as top and peek. Otherwise,
	 * append the new node to the end using peek.next and update peek. Complexity:
	 * Time: O(1) (because peek points to the last node). Space: O(1).
	 * 
	 * 
	 */
	public void push(int data) {
		Node node = new Node(data, null);
		if (top == null) {
			top = node;
			peek = top;
		} else {
			peek.next = node;
			peek = node;
			size++;
		}

	}

	/**
	 * pop() Algorithm: Removes the top element from the stack (start of the list).
	 * If the stack is empty (top == null), return -1. Otherwise, return the data of
	 * the top node and update top to top.next. Complexity: Time: O(1). Space: O(1).
	 * 
	 */
	public int pop() {
		if (top == null) {
			System.out.print("stack is underflow" + " ");
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;

	}

	/**
	 * peek(int data) Algorithm: Returns the top element without removing it.
	 * Returns top.data if the stack is not empty. Outputs a message if the stack is
	 * empty. Complexity: Time: O(1). Space: O(1).
	 *
	 * 
	 * 
	 */
	public int peek(int data) {
		System.out.println("stack is empty" + " ");
		return top.data;
	}

	/**
	 * isempty() Algorithm: Checks if the stack is empty by verifying if top ==
	 * null. Complexity: Time: O(1). Space: O(1).
	 * 
	 */
	public boolean isempty() {
		return top == null;
	}

	/**
	 * print() Algorithm: Traverses the list from top and prints each node's data.
	 * Complexity: Time: O(n), where n is the number of nodes. Space: O(1).
	 * 
	 */
	public void print() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * countOccurance(int data) Algorithm: Counts occurrences of a specific data in
	 * the list. Traverse the list and increment a counter whenever temp.data ==
	 * data. Complexity: Time: O(n). Space: O(1).
	 *
	 * 
	 */
	public int countOccurance(int data) {
		int count = 0;
		Node temp = top;
		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}

	/**
	 * size() Algorithm: Returns the size of the stack, maintained as size.
	 * Complexity: Time: O(1). Space: O(1).
	 * 
	 * 
	 */
	public int size() {
		return size;

	}

	/**
	 * popByposition(int position) Algorithm: Removes the node at the specified
	 * position. Traverse to the node before the specified position. Update the next
	 * pointer to skip the node at position. Complexity: Time: O(n) (for traversal).
	 * Space: O(1).
	 * 
	 */
	public void removeByposition(int position) {
		Node temp = top;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;

		}
		temp.next = temp.next.next;
	}

	/**
	 * findMiddleindex() Algorithm: Finds the middle element using the slow-and-fast
	 * pointer technique. Use two pointers: node moves one step at a time, and temp
	 * moves two steps. When temp reaches the end, node is at the middle.
	 * Complexity: Time: O(n). Space: O(1).
	 * 
	 */
	public int findMiddleindex() {
		Node node = top;
		Node temp = top;

		while (temp != null && temp.next != null) {
			node = node.next;
			temp = temp.next.next;

		}
		return node.data;

	}

	/**
	 * 
	 * If position is less than 0 or greater than the current size of the list,
	 * print an error message or return, as the position is invalid. Create a new
	 * node:
	 * 
	 * Create a new node with the given data and set its next to null. Insert at the
	 * beginning (position 0):
	 * 
	 * If position == 0, insert the new node at the beginning of the list. Set
	 * node.next to top (the current first node). Update top to point to the new
	 * node. Insert at other positions (position > 0):
	 * 
	 * Initialize a temporary node temp and set it to top. Traverse the list to find
	 * the node just before the specified position (i.e., iterate position - 1
	 * times). Once you reach the node before the desired position, update the next
	 * pointer of the node to point to the new node (node.next = temp.next). Update
	 * the next pointer of the previous node (temp.next = node) to insert the new
	 * node at the correct position. Update the size:
	 * 
	 * After the insertion, increment the size by 1. Time Complexity: Time: O(n),
	 * where n is the number of nodes in the list. In the worst case, we need to
	 * traverse the entire list to reach the desired position. Space: O(1), as only
	 * a constant amount of extra space is used for the node and temp variables.
	 * 
	 * 
	 */
	public void insertposition(int data, int position) {
		Node node = new Node(data, null);
		if (position == 0) {
			node.next = top;
			top = node;
		} else {
			Node temp = top;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}

			node.next = temp.next;
			temp.next = node;
		}

		size++;
	}

	/**
	 * contain(int data) Algorithm: Checks if the list contains a specific data.
	 * Traverse the list and return true if temp.data == data. Complexity: Time:
	 * O(n). Space: O(1).
	 * 
	 * 
	 */
	public boolean contain(int data) {
		Node temp = top;
		while (temp != null) {
			if (data == temp.data) {
				return true;
			}
			temp = temp.next;

		}
		return false;

	}

	/**
	 * Check if the list is empty:
	 * 
	 * If top == null, the list is empty, so print "List is empty" and return. No
	 * further action is required. Check if the list has only one element:
	 * 
	 * If top.next == null, it means the list has only one element. Set top = null
	 * to remove the last element (the only element), and the list becomes empty. If
	 * the list has more than one element:
	 * 
	 * Initialize a temporary node temp and set it to top. Traverse the list until
	 * temp.next.next == null (i.e., until temp points to the second-last node). Set
	 * temp.next = null to remove the last node, effectively making the second-last
	 * node the last node. Decrement the size of the list:
	 * 
	 * After removing the last node, decrement the size variable by 1 to reflect the
	 * updated size of the list.
	 */
	public void removelast() {
		if (top == null) {
			System.out.println("List is empty");
			return;
		}

		if (top.next == null) {
			top = null;
		} else {
			Node temp = top;
			while (temp.next != null && temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null; // Remove the last node
		}
		size--;
	}

	/**
	 * popfirst() Algorithm: Removes the first element of the list. Update top to
	 * top.next. Complexity: Time: O(1). Space: O(1).
	 * 
	 */
	public void removefirst() {
		top = top.next;
		size--;

	}

	/**
	 * popfirst() Algorithm: Removes the first element of the list. Update top to
	 * top.next. Complexity: Time: O(1). Space: O(1).
	 * 
	 * @param data
	 */
	public void pushfirst(int data) {
		Node node = new Node(data, null);
		node.next = top;
		top = node;
		size++;
	}

	/**
	 * popfirst() Algorithm: Removes the first element of the list. Update top to
	 * top.next. Complexity: Time: O(1). Space: O(1).
	 * 
	 * @param data
	 */
	public void pushLast(int data) {
		Node node = new Node(data, null);
		if (top == null) {
			top = node;
			size++;
		} else {
			Node temp = top;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}

	}

	/**
	 * Create a class Node with the following attributes: data: Stores the value of
	 * the node. next: Points to the next node in the list (or null if it’s the last
	 * node). Constructor:
	 * 
	 * Initialize the data field with the value passed as a parameter. Initialize
	 * the next field with the reference to the next node (or null if not provided).
	 */
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
