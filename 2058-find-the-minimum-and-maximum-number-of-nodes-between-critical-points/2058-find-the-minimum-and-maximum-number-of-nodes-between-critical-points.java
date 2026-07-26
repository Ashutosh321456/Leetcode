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
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        int idx = 1;
        int firstIdx = -1;
        int lastIdx = -1;
        int minDist = Integer.MAX_VALUE;
        if(head==null || head.next == null || head.next.next == null) return ans;
        while(head.next!=null && head.next.next!=null){
            if((head.next.val>head.val && head.next.val>head.next.next.val) || (head.next.val<head.val && head.next.val<head.next.next.val)){
                if(firstIdx == -1) firstIdx = idx;
                if(lastIdx!=-1){
                    int dist = idx - lastIdx;
                    minDist = Math.min(dist,minDist);
                }
                lastIdx = idx;
            }
            head = head.next;
            idx++;
        }
        int maxDist = lastIdx - firstIdx;
        if(maxDist == 0) maxDist = -1;
        if(minDist == Integer.MAX_VALUE) minDist = -1;
        ans[0]= minDist;
        ans[1]= maxDist;
        return ans;
    }
}