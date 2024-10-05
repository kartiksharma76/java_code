package linkedlist;

public class SinglyLinkedList1 {
	private Node head;
	private Node tail;
	private int size;

	/**
	 * 1. Create a new node 2. check head is null? for first node Yes: Means it is
	 * first node a. update head by new node 3.No: Second node onwards a.Create a
	 * temp node and point to head node. (Node temp = head;) b. Traverse to the last
	 * node(while loop) c.assign new node to temp.next(temp.next = node;) T.C O(n)
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
	 * 1. Create a new node. 2. update node.next by head(node.next=head;) 3. update
	 * head by node.
	 * 
	 * T.C O(1)
	 * 
	 */
	public void addFirst(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
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

	/**
	 * Take a temp node. Traverse the node and compare with provide data till the
	 * last node. if provide data is matched then return true else navigate to the
	 * next node if provide data is not found then return false.
	 * 
	 *
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

	public boolean myContains(int data) {
		Node temp = head;
		if (temp == null)
			throw new RuntimeException("Twinkle you Gadhi list empty hai");

		while (temp != null) {
			if (data == temp.data) {
				return true;
			}
			temp = temp.next;

		}
		return false;

	}

	/**
	 * 1.Take a temp node and assign reference of head node. 2.Traverse till given
	 * position-1 3.Get node at given position. 4.Next node of given position.(Get
	 * node reference of given position+1) 5.Delete the node at given position
	 * temp.next=Get node reference of given position+1 6. De-reference node at
	 * given position. decrease the size by 1
	 * 
	 * @param position
	 */
	public void deleteByPosition(int position) {
		boolean isWithinRange = checkRange(position);
		if (isWithinRange) {
			if (position == 1) {
				deleleFirst();
			} else if (position == size) {
				deleteLast();
			} else {
				Node temp = head;
				for (int i = 1; i < position - 1; i++) {
					temp = temp.next;
				}
				Node nodeAtGivenPosition = temp.next;
				Node nextNode = temp.next.next;// Node nextNode=nodeAtGivenPosition.next;
				temp.next = nextNode;
				nodeAtGivenPosition.next = null;
				size--;
			}
		}

	}

	public boolean checkRange(int position) {
		return position > 0 && position <= size;
	}

	/**
	 * head=head.next; decrease the size by 1
	 */
	public void deleleFirst() {
		head = head.next;
		size--;

	}

	public void deleteLast() {
		Node temp = head;
		for (int i = 1; i < size - 1; i++) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
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
