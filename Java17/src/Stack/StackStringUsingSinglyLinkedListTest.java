package Stack;

public class StackStringUsingSinglyLinkedListTest {
	public static void main(String[] args) {
		StackStringUsingSinglyLinkedList stack = new StackStringUsingSinglyLinkedList();
		stack.push("k");
		stack.push("a");
		stack.push("r");
		stack.push("t");
		stack.push("i");
		stack.push("k");
		stack.push("e");
		stack.push("y");
		stack.display();
		System.out.println();
		System.out.println("after pop:");
		stack.pop();
		stack.pop();
		stack.display();
	}
}
