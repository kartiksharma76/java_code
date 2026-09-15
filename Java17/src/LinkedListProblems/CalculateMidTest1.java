package LinkedListProblems;

public class CalculateMidTest1 {
public static void main(String[] args) {
	CalculateMid1 mid=new CalculateMid1();
	mid.insert(2);
	mid.insert(4);
	mid.insert(6);
	mid.insert(7);
	mid.insert(5);
	mid.insert(1);
	mid.print();
	System.out.println("\n middle node:"+mid.midNode());
}
}
