package Stack;

public class StackUsingLinkedListTest {
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.print();
		System.out.println("after pop :");
		stack.pop();
		stack.print();
		System.out.println("after pushing:");
		stack.push(50);
		stack.print();
	}
}
