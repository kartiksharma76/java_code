package linkedlist;

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	/**
	 * 1. Create a new node
	 * 2. check head is null? for first node
	 *    Yes: Means it is first node
	 *    a. update head by new node
	 * 3.No: Second node onwards
	 *     a.Create a temp node and point to head node.  (Node temp = head;) 
	 *     b. Traverse to the last node(while loop)
	 *     c.assign new node to temp.next(temp.next = node;)
	 * T.C O(n)    
	 * 
	 */
	public void addLast(int data) {
		Node node = new Node(data, null);
		if (head == null) {// first Node
			head = node;
			size++;
		} else {// Second Node onwards
			Node temp = head;
			// for traveling to the node where last node need to be attached
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}

	}

	/**
	 * 1.create a new node 
	 * 2.cheak head is null?for first node
	 * update tail by new node
	 * 3 .second node onward(tail.next=node)
	 * tail=node;
	 * 
	 * T.C O(1)
	 */
	public void addLastUsingTail(int data) {
		Node node = new Node(data, null);
		if (head == null) {// first Node
			head = node;
			tail = head;
			size++;
		} else {// Second Node onwards
			tail.next = node;
			tail = node;
			size++;
		}

	}
	/**
	 * 1. Create a new node.
	 * 2. update node.next by head(node.next=head;)
	 * 3. update head by node.
	 * 
	 * T.C O(1)
	 * 
	 */
	public void addFirst(int data) {
		Node node = new Node(data, null);
		node.next=head;
		head=node;
		size++;
	}

/**
 * 1. Create a node 2. Take a temp node and assign head node to the temp node.
 * 3. Traverse till (position-1) 4. update node.next by temp.next; 5. update
 * temp.next by node. 6. increase the size by 1
 * 
 * T.C O(n)
 * 
 */
	public void addMid(int position, int data) {
		Node node = new Node(data, null);
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;

		}
		node.next = temp.next;
		temp.next = node;
		size++;

	}

	public int size() {
		return size;
	}
	public void print() {
//		System.out.println(head.data);// Node1
//		System.out.println(head.next.data);// Node2
//		System.out.println(head.next.next.data);// Node3
//		System.out.println(head.next.next.next.data);// Node4
//		System.out.println(head.next.next.next.next.data);// Node5
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

