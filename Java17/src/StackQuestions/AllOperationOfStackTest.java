package StackQuestions;

public class AllOperationOfStackTest {
public static void main(String[] args) {
	AllOperationOfStack stack=new AllOperationOfStack();
	System.out.println("Pushing elements...");
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(20); // duplicate to test countOccurrence

    System.out.println("\nCurrent stack:");
    stack.print();

    System.out.println("\nPeek (top element): " + stack.peek());

    System.out.println("\nPopping an element: " + stack.pop());
    System.out.println("Stack after pop:");
    stack.print();

    System.out.println("\nIs stack empty? " + stack.isEmpty());
    System.out.println("Stack size: " + stack.size());

    System.out.println("\nInserting 5 at position 0 (start):");
    stack.insertAt(5, 0);
    stack.print();

    System.out.println("\nInserting 25 at position 2:");
    stack.insertAt(25, 2);
    stack.print();

    System.out.println("\nContains 20? " + stack.contains(20));
    System.out.println("Occurrences of 20: " + stack.countOccurance(20));

    System.out.println("\nFinding middle element: " + stack.findmiddle());

    System.out.println("\nRemoving by position 2:");
    stack.removebyposition(2);
    stack.print();

    System.out.println("\nRemoving first element:");
    stack.removeFirst();
    stack.print();

    System.out.println("\nRemoving last element:");
    stack.removeLast();
    stack.print();

    System.out.println("\nPushing to first (pushFirst(99)):");
    stack.pushFirst(99);
    stack.print();

    System.out.println("\nPushing to last (pushLast(88)):");
    stack.pushLast(88);
    stack.print();
	
}
}
