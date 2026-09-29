class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.val);
    }
    public boolean helper(TreeNode root , int target) {
        if(root==null) return true;
        if(root.val != target) return false;
        return helper(root.left,target) && helper(root.right,target);
    }
}