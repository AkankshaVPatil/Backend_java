//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//19. Remove Nth Node From End of List

public class LinkedList_Prob1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode first = dummy, second = dummy;

        for(int i = 0; i <= n; i++)
        {
            first = first.next;
        }

        while(first != null)
        {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }
}
