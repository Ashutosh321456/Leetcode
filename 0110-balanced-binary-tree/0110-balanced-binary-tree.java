class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftLevels = level(root.left);
        int rightLevels = level(root.right);
        if(Math.abs((leftLevels-rightLevels))>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
    public int level(TreeNode root){
        if(root == null ) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
}