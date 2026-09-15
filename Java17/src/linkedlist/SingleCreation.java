package linkedlist;

import java.util.Scanner;

public class SingleCreation {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void creation() {

		int data, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter data");
			data = sc.nextInt();
			Node newnode = new Node(data);
			if (head == null) {
				head = newnode;// 10

			} else {
				newnode.next = head;// 30,20,10,
				head = newnode;
			}
			System.out.println("do you want to add more data. if yes,press:1");
			n = sc.nextInt();

		} while (n == 1);

	}

	public void treaversing() {
		Node temp = head;
		if (head == null) {
			System.out.println("ll is not exist");
		} else {
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}

	}

	public static void main(String[] args) {
		SingleCreation LL = new SingleCreation();
		LL.creation();
		LL.treaversing();
	}

}
