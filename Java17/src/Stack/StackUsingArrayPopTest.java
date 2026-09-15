package Stack;

public class StackUsingArrayPopTest {
	public static void main(String[] args) {
		StackUsingArrayPop stack = new StackUsingArrayPop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		// stack.push(100);
		stack.print();
		System.out.println();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.print();
	}
}
