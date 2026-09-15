package litcode;
/**
| Compare   | Added |
| --------- | ----- |
| 1 vs 1    | 1     |
| 2 vs 1    | 1     |
| 2 vs 3    | 2     |
| 4 vs 3    | 3     |
| 4 vs 4    | 4     |
| remaining | 4     |

 */
class SIRT {
	int val;
	SIRT next;

	public SIRT(int val) {
		this.val = val;
		this.next = null;
	}
}

public class MergeTwoSortedList {
	public static SIRT mergeTwoLists(SIRT list1, SIRT list2) {
		SIRT dummy = new SIRT(0);
		SIRT current = dummy;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;

			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}
		return dummy.next;

	}

	public static void printList(SIRT head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		SIRT list1 = new SIRT(1);
		list1.next = new SIRT(2);
		list1.next.next = new SIRT(4);

		SIRT list2 = new SIRT(1);
		list2.next = new SIRT(3);
		list2.next.next = new SIRT(4);

		SIRT result = mergeTwoLists(list1, list2);
		printList(result);
	}
}
