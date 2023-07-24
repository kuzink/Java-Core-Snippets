package algorithms;

public class MergeTwoSortedLists {

	//You are given the heads of two sorted linked lists list1 and list2.
	//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
	//Return the head of the merged linked list.

	public static void main(String[] args) {
		MergeTwoSortedLists task = new MergeTwoSortedLists();

		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(9);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		System.out.println(task.resolve(list1, list2));
	}

	public ListNode resolve(ListNode list1, ListNode list2) {

		if(list1 != null && list2 != null) {

			if (list1.val < list2.val) {
				list1.next = resolve(list1.next, list2);
				return list1;
			}
			else {
				list2.next = resolve(list1, list2.next);
				return list2;
			}
		}

		if(list1 == null) {
			return list2;
		}

		return list1;
	}
}


class ListNode {

	int val;
	ListNode next;

	ListNode() {}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}