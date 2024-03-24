package com.techsavvy.linkedList;

public class IsPalindrome {
	public static void main(String[] args) {
		IsPalindrome sol = new IsPalindrome();
	    ListNode head = new ListNode(2);
	    head.next = new ListNode(4);
	    head.next.next = new ListNode(6);
	    head.next.next.next = new ListNode(4);
	    head.next.next.next.next = new ListNode(2);
	   // System.out.println("Is palindrome: " + sol.isPalindrome(head));

	    head.next.next.next.next.next = new ListNode(2);
	    System.out.println("Is palindrome: " + sol.isPalindrome(head));
	  }
	
	public boolean isPalindrome(ListNode head) {
	    if(head == null || head.next == null){
	      return false;
	    }
	    boolean palindrome = false;
	    
	   int len = length(head);
	   ListNode midHead = findMid(head);
	   ListNode reverseHead = null;
	   if(len%2 == 0) {
		   reverseHead = reverse(midHead);
	   } else {
		   reverseHead = reverse(midHead);
	   }
	   ListNode reverseHeadCopy = reverseHead;
	   ListNode curr = head;
	   while(reverseHead != null){
	    if(curr.val != reverseHead.val){
	      return false;
	    }
	    curr = curr.next;
	    reverseHead = reverseHead.next;
	   }
	    return true;
	  }

	  private static ListNode findMid(ListNode Head){
	    ListNode slow = Head;
	    ListNode fast = Head;
	    while(fast != null && fast.next != null){
	      fast = fast.next.next;
	      slow = slow.next; 
	    }
	    return slow;
	  }

	  private static ListNode reverse(ListNode head){
	    ListNode prev = null;
	    ListNode next = null;
	    ListNode curr = head;
	    while(curr != null){
	      next  = curr.next;
	      curr.next = prev;
	      prev = curr;
	      curr = next;
	    }
	    return prev;
	  }
	  
	  private static int length(ListNode head) {
		  	ListNode curr = head;
			int count = 0;
			while(curr != null) {
				curr = curr.next;
				count++;
			}
			return count;
		}
}

class ListNode {
	  int val = 0;
	  ListNode next;

	  ListNode(int val) {
	    this.val = val;
	  }
	}
