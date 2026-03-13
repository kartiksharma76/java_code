package litcode;

class ListNode3 {
	int val;
	ListNode3 next;

	ListNode3(int val) {
		this.val = val;
	}
}

public class AddTwoNumbers {
	public ListNode3 addTwoNumbers(ListNode3 l1, ListNode3 l2) {
		ListNode3 dummy = new ListNode3(0);
		ListNode3 current = dummy;

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

			current.next = new ListNode3(sum % 10);
			current = current.next;
		}

		return dummy.next;
	}
}