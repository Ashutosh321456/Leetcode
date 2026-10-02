class Solution {
    static TreeNode first = null;
    static TreeNode sec = null;
    static TreeNode prev = null;
    public void recoverTree(TreeNode root) {
        first = null;
        sec = null;
        prev = null;
      inorder(root);
      if (first != null && sec != null) {
            int temp = first.val;
            first.val = sec.val;
            sec.val = temp;
        }

    }
    public void inorder(TreeNode root) {
    if(root==null) return;
    inorder(root.left);
    if(prev!=null && prev.val>root.val){
        if(first==null){
            first = prev;
            sec = root;
        }
        else sec = root;
    }
    prev = root;
    inorder(root.right);

    }
}