package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
Queue<Integer> q1,q2;
 
public StackUsingTwoQueue(){
	q1=new LinkedList<>();
	q2=new LinkedList<>();
	
		
	}
public void push(int data) {
	q2.add(data);
	while(!q1.isEmpty()) {
		q2.add(q1.poll());
	}
	//q1 and q2 swap
	Queue<Integer> temp=q1;
	q1=q2;
	q2=temp;
	
  }
public int pop() {
	if (q1.isEmpty()) {
		System.out.println("stack is empty");
		return-1;
	}
	return q1.poll();

}
public int top() {
	if(q1.isEmpty()) {
		return-1;
		
	}
	return q1.peek();
}
public boolean empty() {
	return q1.isEmpty();
}
}


