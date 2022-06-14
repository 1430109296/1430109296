package medium;

import bean.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
		ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
		ListNode sum = addTwoNumbers(l1, l2);
		while (sum != null) {
			System.out.println(sum.val);
			sum = sum.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode sum = new ListNode(0);
		name(l1, l2, sum);
		return sum;
    }
	
	public static void name(ListNode l1, ListNode l2,ListNode sum) {
		if (l1 == null && l2 != null) {
			l1 = new ListNode(0);
		}
		if (l1 != null && l2 == null) {
			l2 = new ListNode(0);
		}
		
		if (l1 != null && l2 != null) {
			sum.next = new ListNode();
			if (sum.val+l1.val+l2.val>=10) {
				sum.val = (sum.val+l1.val+l2.val)%10;
				sum.next.val = 1;
			}else {
				sum.val = sum.val+l1.val+l2.val;
				sum.next.val = 0;
			}
		}
		if (l1.next == null && l2.next == null) {
			if (sum.next.val == 1) {
				return;
			}else {
				sum.next = null;
				return;
			}
		}
		name(l1.next, l2.next, sum.next);
	}
}
