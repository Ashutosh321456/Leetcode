
class Solution {
       public ListNode reverseList(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverseList(a);
        a.next = head;
        return b;

    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverseList(head2);

        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        ListNode t1=head;
        ListNode t2 = head2;
        while(t2!=null){
            k.next = t1;
            k = k.next;
            t1 = t1.next;

            k.next = t2;
            k=k.next;
            t2 = t2.next;
        }
        k.next = t1;
        
    }
}