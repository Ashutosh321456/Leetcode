/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node , int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
     private static void levelOrderLineWise(TreeNode root , List<List<Integer>> ans) {
        if (root == null) return;
        
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root,0));

        List<Integer> subList = new ArrayList<>();

        while(q.size()>0){
            Pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;

            if(level!=currLevel){
                ans.add(subList);
                subList = new ArrayList<>();
                currLevel = level;
            }
            
            subList.add(node.val);
            
            if(node.left!=null) q.add(new Pair(node.left,level+1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));
        }
        if (!subList.isEmpty()) {
            ans.add(subList);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrderLineWise(root, ans);
        return ans;
    }
}