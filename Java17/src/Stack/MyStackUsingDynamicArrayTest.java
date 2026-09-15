package Stack;

public class MyStackUsingDynamicArrayTest {
public static void main(String[] args) {
	MystackUsingDynamicArray1 stack=new MystackUsingDynamicArray1();
	stack.push(10);
	stack.push(20);
	stack.push(60);
	stack.push(30);
	stack.push(40);
	stack.print();
	System.out.println();
	stack.pop();
	stack.print();
}
}
