/**
https://leetcode.com/problems/reverse-linked-list-ii/
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 1; i < left; i++)
        {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        for(int i = 0; i < right-left; i++)
        {
            ListNode nxt = curr.next;
            curr.next = nxt.next;
            nxt.next = prev.next;
            prev.next = nxt;
        }
        return dummy.next;
    }
}
