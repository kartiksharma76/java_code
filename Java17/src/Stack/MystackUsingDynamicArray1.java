package Stack;

import array.MyArrayList;

public class MystackUsingDynamicArray1 {
private MyArrayList list;
public MystackUsingDynamicArray1() {
	list=new MyArrayList();
	
}
public void push(int data) {
	list.add(data);
	
}
public int size() {
	return list.size();
	
}
public void print() {
	for(int i=list.size()-1;i>=0;i--) {
		System.out.println(list.get(i)+" ");
	}	
	
}
public int pop() {
	int data=list.get(list.size()-1);
	list.deleteByIndex(list.size()-1);
	return data;
	
}
public int peek() {
	return list.get(list.size()-1);
	
}
}
