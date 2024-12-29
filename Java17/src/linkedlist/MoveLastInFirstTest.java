package linkedlist;

public class MoveLastInFirstTest {
public static void main(String[] args) {
	MoveLastInFirst list=new MoveLastInFirst();
	   list.insert(2);
       list.insert(5);
       list.insert(6);
       list.insert(2);
       list.insert(1);

       System.out.println("Original List:");
       list.printList();

     list.moveLastToFront();

       System.out.println("Modified List:");
       list.printList();
}

}
