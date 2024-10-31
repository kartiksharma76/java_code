package queue;

import java.util.LinkedList;

public class MyQueueUsingLinkedList {
//	private SinglyLinkedList list;//custom class written by you
	private LinkedList<Integer> list;// Java library class

	public MyQueueUsingLinkedList() {
//		list = new SinglyLinkedList();
		list = new LinkedList<>();
	}

	public void enqueue(int data) {
//		list.addLastUsingTail(data);
		list.add(data);
	}

	public void dequeue() {
//		list.deleleFirst();
		list.removeFirst();
	}

	public void print() {
		for (int data : list) {
			System.out.print(data + " ");
		}
	}

}
