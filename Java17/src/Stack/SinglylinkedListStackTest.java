package Stack;

public class SinglylinkedListStackTest {
	public static void main(String[] args) {
		SinglylinkedListStack stack = new SinglylinkedListStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.display();
		System.out.println();
		System.out.println("after popped:");
		stack.pop();
		stack.pop();
		stack.display();

	}
}
