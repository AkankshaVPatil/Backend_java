public class LinkedList_prob2 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode evenList = head.next;

        ListNode odd = head, even = evenList;
        while(even != null && even.next != null)
        {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenList;
        return head;
    }
}
