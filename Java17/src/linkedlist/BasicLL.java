package linkedlist;

public class BasicLL {
	public static void insertatEnd(Node head, int val) {
		Node temp = new Node(val);
		Node t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = temp;
	}

	// this code is display the recursively ofthe original element to reverse
	public static void displayreverse(Node head) {
		if (head == null)
			return;

		displayreverse(head.next);
		System.out.print(head.data + " ");
	}

	public static void display(Node head) {
		// this is the code for displaying printing the list
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static int length(Node head) {
		int count = 0;

		while (head != null) {
			count++;
			head = head.next;

		}
		return count;
	}

	public static class Node {
		int data;// value
		Node next;// address of next node

		Node(int data) {
			this.data = data;

		}

	}

	public static void main(String[] args) {
		Node a = new Node(5);// head node
		// System.out.println(a.next);//null
		Node b = new Node(3);// 5,3,9,8,16
		Node c = new Node(9);// 5,3,9,,8,16
		Node d = new Node(8);// 5,3,9,,8,16
		Node e = new Node(16);// 5,3,9,,8,16

		a.next = b;// 5->3 ,9 ,8,16
		b.next = c;// 4->3->9,8,16
		c.next = d;// 4->3->9->8,16
		d.next = e;// 4->3->9->8->16

		/**
		 * System.out.println(b.data );//3 System.out.println(a.data );//5
		 * System.out.println(a.next .data );//3
		 * 
		 * 
		 * // 5->3->9->8->16
		 * 
		 * System.out.println(a );//linkedlist.BasicLL$Node@49e4cb85
		 * System.out.println(a.next);// BasicLL$Node@2133c8f8
		 * System.out.println(b);//BasicLL$Node@2133c8f8
		 * System.out.println(c);//BasicLL$Node@43a25848
		 * 
		 * 
		 * System.out.println(a.data );//5 System.out.println(b.data );//3
		 * System.out.println(c.data );//9 System.out.println(d.data );//8
		 * System.out.println(e.data );//16
		 * 
		 * 
		 * System.out.println(a.data); System.out.println(a.next .data );
		 * System.out.println(a.next .next .data ); System.out.println(a.next .next
		 * .next .next .data ); System.out.println(a.next .next .next .next .data );
		 **/

//      Node temp =a;
//      for (int i=1; i<=5; i++) {
//    	  System.out.print(temp.data+" ");
//    	  temp= temp.next ;
		// output is same 5,3,9,8,16 but this is not suffisient in linked list

		display(a);
		insertatEnd(a, 87);
		System.out.println();
		displayreverse(a);
		System.out.println();
		System.out.print(length(a));

	}
}
