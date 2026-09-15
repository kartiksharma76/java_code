package LinkedListProblems;

public class CalculateMidTest {
public static void main(String[] args) {
	CalculateMid mid=new CalculateMid();
	mid.insert(1);
	mid.insert(2);
	mid.insert(3);
	mid.insert(4);
	mid.insert(5);
	mid.print();
	System.out.println("\ncalculate middle node:"+mid.midNode());
	
}
}
