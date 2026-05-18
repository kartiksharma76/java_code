package StackQuestions;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class StackUsingLinkedList {
	 Node top;

	    void push(int data) {

	        Node newNode = new Node(data);

	        newNode.next = top;

	        top = newNode;
	    }

	    void pop() {

	        if(top == null) {
	            System.out.println("Empty Stack");
	            return;
	        }

	        System.out.println("Removed: " + top.data);

	        top = top.next;
	    }

	    void peek() {

	        if(top == null) {
	            System.out.println("Empty");
	            return;
	        }

	        System.out.println("Top: " + top.data);
	    }

	    void display() {

	        Node temp = top;

	        while(temp != null) {
	            System.out.println(temp.data);
	            temp = temp.next;
	        }
	    }

	    public static void main(String[] args) {

	    	StackUsingLinkedList st = new StackUsingLinkedList();

	        st.push(10);
	        st.push(20);
	        st.push(30);

	        st.display();

	        st.pop();

	        st.peek();
	    }
}
