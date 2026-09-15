package Stack;

public class MyStackUsingSinglyLinkedList1Test {
public static void main(String[] args) {
	MyStackUsingSinglyLinkedList1 stack= new MyStackUsingSinglyLinkedList1();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	System.out.println(stack.size());
	stack.print();
}
}
