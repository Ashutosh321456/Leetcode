class Solution {
        public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev; 
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           ListNode temp1 = reverse(l1);
     ListNode temp2 = reverse(l2);
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(temp1!=null || temp2!= null){
             int x = (temp1 != null) ? temp1.val : 0;
            int y = (temp2 != null) ? temp2.val : 0;
            int sum = x + y + carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            tail.next = node;
            tail = node;
         if(temp1 != null) temp1 = temp1.next;
         if(temp2 != null) temp2 = temp2.next;
        }
         if(carry != 0){
            tail.next = new ListNode(carry);
        }
            return reverse(dummy.next);

    
    }
}