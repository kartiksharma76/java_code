package Stack;


import linkedlist.SinglyLinkedList1;

public class MyStackUsingSinglyLinkedList1 {
private SinglyLinkedList1 List;

public MyStackUsingSinglyLinkedList1() {
	
	List = new SinglyLinkedList1();
}

public void push(int data) {
	List.addFirst(data);
	
}
public int size() {
	return List.size();
	
}
public void print() {
List.print();
}


	
}


