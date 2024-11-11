package linkedlist;

public class Node2 {
	    int data;
	    Node next;

	    Node2(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList2 {
	    Node head;

	    public void push(int data) {
	        Node node = new Node(data);
	        	node.next = head;
	        head = node;
	    }

	    public int getLength() {
	        Node temp = head;
	        int count = 0;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }

	    
	}


