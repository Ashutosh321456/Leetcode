class Solution {
    static boolean flag;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        flag = true;
        level(root);
        return flag;
    }
    public int level(TreeNode root){
        if(root == null ) return 0;
        int leftLevels = level(root.left);
        int rightLevels = level(root.right);
        if(Math.abs((leftLevels-rightLevels))>1) flag = false;
        return 1 + Math.max(leftLevels,rightLevels);
    }
}