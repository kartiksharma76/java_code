package linkedlist;

public class Implimentation {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static class BasicLL {
		Node head = null;
		Node tail = null;
		int size = 0;

		public void insertatend(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;

			}
			tail = temp;
			size++;
		}

		public void insertathead(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = tail = temp;
			} else {
				temp.next = head;
				head = temp;
			}
			size++;
		}

		public void insertat(int position, int val) {
			Node t = new Node(val);
			Node temp = head;
			if (position == size()) {
				insertatend(val);
				return;
			} else if (position == 0) {
				insertathead(val);
				return;

			} else if (position < 0 || position > size()) {
				System.out.println("false position");
				return;
			}

			for (int i = 0; i <= position - 1; i++) {
				temp = temp.next;
			}

			t.next = temp.next;
			temp.next = t;
			size++;
		}

		public int getat(int position) {
			if (position < 0 || position > size()) {
				System.out.println("false position");
				return -1;
			}
			Node temp = head;
			for (int i = 0; i <= position; i++) {
				temp = temp.next;

			}

			return temp.data;
		}

		public void deleteAt(int position) {
			if (position == 0) {
				head = head.next;
				size--;
				return;
			}
			Node temp = head;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next.next;
			tail = temp;
			size--;
		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}

		int size() {
//	    	  Node temp=head;
//	    	  int count =0;
//		      while(temp!=null) {
//		    	 count++;
//		    	  temp=temp.next; 
//	      }
			return size;

		}

	}

	public static void main(String[] args) {
		BasicLL b = new BasicLL();
		b.insertatend(2);
		b.insertatend(7);
		b.insertatend(12);
		b.display();
		System.out.println();
		b.insertatend(15);
		b.display();
		System.out.println();
		b.insertathead(13);
		b.display();
		System.out.print(b.size());
		System.out.println();
		b.insertat(3, 6);
		b.display();
		System.out.println();
		b.insertat(0, 100);
		b.display();
		System.out.println();
		System.out.println(b.tail.data);
		System.out.println(b.getat(3));
		System.out.println(b.getat(10));
		System.out.println(b.size);
		b.deleteAt(4);
		b.display();
		System.out.println(b.tail.data);
	}
}
