class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode> ans = new ArrayList<>();
        dfs(root ,ans);
        for(int i=0;i<ans.size()-1;i++){
            TreeNode a = ans.get(i);
            TreeNode b = ans.get(i+1);
            a.right = b;
            a.left = null;
        }
        TreeNode last = ans.get(ans.size()-1);
        last.right=null;
        last.left = null;
    }

    private void dfs(TreeNode root , ArrayList<TreeNode> ans) {
        if(root==null) return;
        ans.add(root);
        dfs(root.left ,ans);
        dfs(root.right ,ans);
    }
}