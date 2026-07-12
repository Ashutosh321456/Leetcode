
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = new ListNode(-1);
        ListNode i= head;
        ListNode d =t;
        
        while(i!=null){
            if( i.next!=null && i.val==i.next.val) {
                ListNode j =i;
                while(j.next!=null && j.val==j.next.val){
                    j=j.next;
                }
                i=j.next;
            }
            else{
                t.next=i;
                t=i;
                i=i.next;
            }
        }
        t.next=null;
        return d.next;
    }
}