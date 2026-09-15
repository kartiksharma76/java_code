package Stack;

import java.util.Stack;

public class MinStack1 {
public static int minStack(Stack<Integer>stack) {
	if (stack.isEmpty()) {
		return-1;
		
	}
	int min=stack.peek();
	for(int i:stack) {
		min=Math.min(min, i);
		
	}
	return min;
}
public static void main(String[] args) {
	Stack<Integer>stack=new Stack();
	stack.push(18);
	stack.push(18);
	stack.push(29);
	stack.push(15);
	stack.push(16);
	int min=minStack(stack);
	System.out.println("min elemnt:"+min);
}
}
