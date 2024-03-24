package com.techsavvy.linkedList;

public class RearrangeLinkedList {
	public static void main(String[] args) {
		RearrangeLinkedList sol = new RearrangeLinkedList();
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(8);
		head.next.next.next.next = new ListNode(10);
		head.next.next.next.next.next = new ListNode(12);
		reorder(head);
		while (head.next != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static ListNode reorder(ListNode head) {
		ListNode curr = head;
		ListNode middle = findMiddle(head);
		ListNode revHead = reverseLinkedList(middle);
		middle.next = null;
		while (curr != null && revHead != null) {
			ListNode t1 = curr.next;
			ListNode t2 = revHead.next;
			curr.next = revHead;
			revHead.next = t1;
			revHead = t2;
			curr = t1;
		}
		return head;
	}

	private static ListNode reverseLinkedList(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		ListNode next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private static ListNode findMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
