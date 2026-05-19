package javaDsaPattern;

//Add Two Numbers Linked List

class ListNode1 {

	int val;
	ListNode1 next;

	ListNode1(int val) {
		this.val = val;
	}
}

public class AddTwoNumbers {

	public static ListNode1 add(ListNode1 l1, ListNode1 l2) {

		ListNode1 dummy = new ListNode1(0);

		ListNode1 current = dummy;

		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {

			int sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;

			current.next = new ListNode1(sum % 10);

			current = current.next;
		}

		return dummy.next;
	}

	public static void print(ListNode1 head) {

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		ListNode1 l1 = new ListNode1(2);
		l1.next = new ListNode1(4);
		l1.next.next = new ListNode1(3);

		ListNode1 l2 = new ListNode1(5);
		l2.next = new ListNode1(6);
		l2.next.next = new ListNode1(4);

		ListNode1 result = add(l1, l2);

		print(result);
	}
}