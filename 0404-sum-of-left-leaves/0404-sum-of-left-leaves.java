class Solution {
    static int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        dfs(root,false);
        return sum;
    }
    public void dfs(TreeNode root,boolean isLeft) {
        if(root==null) return;
        if(root.left==null && root.right == null && isLeft==true)
            sum += root.val;
        dfs(root.left,true);
        dfs(root.right,false);
    }
}