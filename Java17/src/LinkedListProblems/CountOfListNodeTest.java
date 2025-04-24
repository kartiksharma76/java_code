package LinkedListProblems;
//Input: LinkedList : 1->2->3->4->5
//Output: 5
//Explanation: Count of nodes in the linked list is 5, which is its length
public class CountOfListNodeTest {
public static void main(String[] args) {
	CountOfListNode list=new CountOfListNode();
	list.insert(1);
	list.insert(2);
	list.insert(3);
	list.insert(4);
	list.insert(5);
	list.display();
	System.out.println("length of listNode:"+list.length());
}
}
