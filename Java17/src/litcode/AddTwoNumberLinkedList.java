package litcode;

public class AddTwoNumberLinkedList {
	private Node head;
	private int size;

	// Adds a node at the beginning (not used here, but kept for completeness)
	public void add(int data) {
		Node node = new Node(data, head);
		head = node;
		size++;
	}

	// Adds a node at the end
	public void addlast(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}

	// Prints the list in a readable format like: 2 -> 4 -> 3
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null) {
			}
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		return size;
	}

	public Node getHead() {
		return head;
	}

	// Node class representing each element in the list
	class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public static AddTwoNumberLinkedList addLists(Node l1, Node l2) {
		AddTwoNumberLinkedList result = new AddTwoNumberLinkedList();
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.data;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.data;
				l2 = l2.next;
			}
			carry = sum / 10;
			result.addlast(sum % 10);
		}
		return result;
	}

	public static void main(String[] args) {
		AddTwoNumberLinkedList list1 = new AddTwoNumberLinkedList();
		list1.addlast(2);
		list1.addlast(4);
		list1.addlast(3);

		System.out.println("List 1:");
		list1.print(); // 2 -> 4 -> 3

		AddTwoNumberLinkedList list2 = new AddTwoNumberLinkedList();
		list2.addlast(5);
		list2.addlast(6);
		list2.addlast(4);

		System.out.println("List 2:");
		list2.print(); // 5 -> 6 -> 4

		AddTwoNumberLinkedList sumList = addLists(list1.getHead(), list2.getHead());

		System.out.println("Sum:");
		sumList.print(); // Should print 7 -> 0 -> 8 (342 + 465 = 807)
	}
}
