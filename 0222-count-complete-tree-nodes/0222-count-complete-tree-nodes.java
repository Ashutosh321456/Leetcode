class Solution {
    public int countNodes(TreeNode root) {
        int left = leftHeight(root);
        int right = rightHeight(root);
        if(left==right){
            return (int)Math.pow(2,left)-1;
        }
        else return nodes(root);
    }
      public int leftHeight(TreeNode root) {
        if(root==null) return 0;
        return 1+leftHeight(root.left);
    }
      public int rightHeight(TreeNode root) {
        if(root==null) return 0;
        return 1+rightHeight(root.right);
    }
      public int nodes(TreeNode root) {
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}