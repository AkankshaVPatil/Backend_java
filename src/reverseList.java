/**
https://leetcode.com/problems/reverse-linked-list/
 */
//Using Recursion
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }
}


/****************************************************
  Iterative Approach
  ************************************************/
  class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null;
        while(curr != null)
        {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
