class Quad{
    int max;
    int min;
    int sum;
    boolean isBST;
    Quad(int max , int min , int sum , boolean isBST){
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
    }
}
class Solution {
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);
        return maxSum;
    }
        public Quad helper(TreeNode root) {
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad left = helper(root.left);
        Quad right = helper(root.right);

        int max = Math.max(root.val, Math.max(left.max,right.max));
        int min = Math.min(root.val, Math.min(left.min,right.min));
        
        int sum = root.val + left.sum + right.sum;
        
        boolean isBST = left.isBST && right.isBST && (left.max < root.val) && (right.min > root.val);
        if(isBST) maxSum = Math.max(sum,maxSum);
        return new Quad(max,min,sum,isBST);
    }
}