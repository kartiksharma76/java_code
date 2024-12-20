package Stack;

import java.util.Stack;

public class Minstack3 {
Stack<Integer>stack=new Stack<>();
Stack<Integer>Minstack=new Stack<>();

public void push (int data) {
	if(Minstack.isEmpty()||data<Minstack.peek()) {
		Minstack.push(data);
	}
	
}
public int peek() {
	return stack.peek();
	
}
public int pop() {
	int removedata=Minstack.pop();
	if(removedata==Minstack.peek()) {
		Minstack.pop();
	}
	return removedata;
}
public int mindata() {
	return Minstack.peek();
}
}
