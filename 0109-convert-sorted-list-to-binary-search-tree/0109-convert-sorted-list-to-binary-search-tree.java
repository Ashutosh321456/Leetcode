class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        List<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        return convert(arr,0,arr.size()-1);
    }
       public TreeNode convert(List<Integer> arr , int lo , int hi) {
        if(lo>hi) return null;
        int mid = lo+(hi-lo)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = convert(arr,lo,mid-1);
        root.right = convert(arr,mid+1,hi);
        return root;
    }
}