package Stack;

public class AllopertionStackTest {
	public static void main(String[] args) {
		AlloperationStack stack = new AlloperationStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(10);
		stack.push(40);
		stack.push(10);
		System.out.println("original stack:");
		stack.print();
		System.out.println();
		System.out.println("print count occurance:");
		int data = 10;
		int occurrences = stack.countOccurance(data);
		System.out.println("The key " + data + " appears " + occurrences + " times.");
		System.out.println();
		System.out.println("delete by position:");
		stack.removeByposition(3);
		stack.print();
		System.out.println();
		System.out.println("find middle index:");
		System.out.println(stack.findMiddleindex());
		System.out.println();
		System.out.println("removelast:");
		stack.removelast();
		stack.print();
		System.out.println();
		System.out.println("insert at position:");
		stack.insertposition(50, 0);
		stack.print();
		System.out.println();
		System.out.println("remove first:");
		stack.removefirst();
		stack.print();
		System.out.println();
		System.out.println("pushfirst:");
		stack.pushfirst(90);
		stack.print();
		System.out.println();
		System.out.println("pushlast:");
		stack.pushLast(20);
		stack.print();
		System.out.println();
		System.out.println("pop:");
		stack.pop();
		stack.print();
		System.out.println();
		System.out.println("peek:");
		stack.peek(100);
		stack.print();
		System.out.println();
		System.out.println("size:" + stack.size());
		System.out.println("cheak value:" + stack.contain(100));
		System.out.println("cheak value:" + stack.contain(10));
		System.out.println("stack is empty:" + stack.isempty());
		stack.print();

	}
}
