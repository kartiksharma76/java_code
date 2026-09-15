package linkedlist;

public class ListNode {

	int val;
	ListNode next;
	
	ListNode(int val){	
		this.val =val;
		this.next =null;
		
	}
}
   class RemoveDuplicates{
	 public static ListNode removeDuplicates(ListNode head) {
		 if (head==null) {
		return head;
	 }
		 ListNode current=head;
		 while(current!=null) {
			
			 while(current.next!=null&&current.val ==current.next.val ) {
				 current.next =current.next .next ;
				 
			 }
			 current=current.next ;
		 }
		 return head;
 }
	 public static void main(String[] args) {
	        // Create the linked list
	        ListNode head = new ListNode(2);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(4);
	        head.next.next.next = new ListNode(5);

	        // Remove duplicates
	        head = removeDuplicates(head);

	        // Print the modified linked list
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}


 
 