package Stack;

public class MyStackUsingDyanmicArrayTest {
	public static void main(String[] args) {
		MyStackUsingDynamicArray stack = new MyStackUsingDynamicArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(110);
		stack.push(120);
		stack.push(130);
		stack.push(140);
		stack.push(150);
		stack.push(160);
		System.out.println(stack.size());
		System.out.println();
		stack.print();
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());

		System.out.println(stack.size());
		stack.print();
	}
}
